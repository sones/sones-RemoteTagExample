/*
* sones GraphDB - Community Edition - http://www.sones.com
* Copyright (C) 2007-2011 sones GmbH
*
* This file is part of sones GraphDB Community Edition.
*
* sones GraphDB is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, version 3 of the License.
* 
* sones GraphDB is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public License
* along with sones GraphDB. If not, see <http://www.gnu.org/licenses/>.
* 
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RemoteAPIClient.sones.GraphDS;
using System.Diagnostics;

namespace RemoteAPIClient
{
    public class RemoteTagExample
    {
        #region Data

        private GraphDSClient GraphDS_API;
        private VertexInstanceServiceClient _VertexInstanceService;
        private VertexTypeServiceClient _VertexTypeService;
        private EdgeInstanceServiceClient _EdgeInstanceService;
        private EdgeTypeServiceClient _EdgeTypeService;

        private ServiceSecurityToken SecToken;
        private Int64 TransToken;


        #endregion
       

        public RemoteTagExample()
        {
            GraphDS_API =  new GraphDSClient();
            _VertexInstanceService = new VertexInstanceServiceClient();
            _VertexTypeService = new VertexTypeServiceClient();
            _EdgeInstanceService = new EdgeInstanceServiceClient();
            _EdgeTypeService = new EdgeTypeServiceClient();
        }


        public void Run()
        {
            //for each request, you need an SecurityToken and a Int64
            SecToken = GraphDS_API.LogOn("test", "test");
            TransToken = GraphDS_API.BeginTransaction(SecToken);

            Stopwatch RunningTime = new Stopwatch();

            RunningTime.Start();

            #region Run Tasks

            Console.WriteLine("_________Generate DB Content:___________________________" + Environment.NewLine);
            GenerateDBContent();
            Console.Write(Environment.NewLine);
            
            Console.WriteLine("_________Gather some data out of the DB:________________" + Environment.NewLine);
            GatherData();
            Console.Write(Environment.NewLine);

            #endregion

            RunningTime.Stop();



            Console.WriteLine("________Example successful executed in " + RunningTime.ElapsedMilliseconds + " ms!______________" 
                + Environment.NewLine + "Do you want to clear GraphDB? <y> | <n>");

            switch (Console.ReadLine())
            {
                case "y":
                    GraphDS_API.Clear(SecToken, TransToken);
                    Console.WriteLine("GraphDB successful cleared!");
                    break;
                default:
                    break;
            }

            
            Console.WriteLine("Press <Any Key> to end GraphDB Remote API Example!");
            Console.ReadLine();
                      

        }




        public static void Main()
        {

            RemoteTagExample Example = new RemoteTagExample();
            Example.Run();
           
        }

        #region How to: Create Vertex Types / Insert Data into Vertices
        
        private void GenerateDBContent()
        {
            #region define type "Tag"

            //create a VertexTypePredefinition
            var Tag_VertexTypePredefinition = new ServiceVertexTypePredefinition();
            Tag_VertexTypePredefinition.VertexTypeName = "Tag";
            Tag_VertexTypePredefinition.Properties = new List<ServicePropertyPredefinition>();
            Tag_VertexTypePredefinition.OutgoingEdges = new List<ServiceOutgoingEdgePredefinition>();


            //create property
            var PropertyName = new ServicePropertyPredefinition();
            PropertyName.AttributeName = "Name";
            PropertyName.AttributeType = "String";
            PropertyName.Comment = "This is a property on type 'Tag' named 'Name' and is of type 'String'";


            //add property
            Tag_VertexTypePredefinition.Properties.Add(PropertyName);


            //create outgoing edge to "Website"
            var OutgoingEdgesTaggedWebsites = new ServiceOutgoingEdgePredefinition();
            OutgoingEdgesTaggedWebsites.AttributeName = "TaggedWebsites";
            OutgoingEdgesTaggedWebsites.AttributeType = "Website";
            OutgoingEdgesTaggedWebsites.Multiplicity = ServiceEdgeMultiplicity.MultiEdge;
            OutgoingEdgesTaggedWebsites.Comment = @"This is an outgoing edge on type 'Tag' wich points to the type 'Website' (the AttributeType) 
                                                                            and is defined as 'MultiEdge', which means that this edge can contain multiple single edges";


            //add outgoing edge
            Tag_VertexTypePredefinition.OutgoingEdges.Add(OutgoingEdgesTaggedWebsites);


            #endregion

            #region define type "Website"

            //create a VertexTypePredefinition
            var Website_VertexTypePredefinition = new ServiceVertexTypePredefinition();
            Website_VertexTypePredefinition.VertexTypeName = "Website";
            Website_VertexTypePredefinition.Properties = new List<ServicePropertyPredefinition>();
            Website_VertexTypePredefinition.Indices = new List<ServiceIndexPredefinition>();
            Website_VertexTypePredefinition.IncomingEdges = new List<ServiceIncomingEdgePredefinition>();

            //create properties
            PropertyName = new ServicePropertyPredefinition();
            PropertyName.AttributeName = "Name";
            PropertyName.AttributeType = "String";
            PropertyName.Comment = "This is a property on type 'Website' named 'Name' and is of type 'String'";

            var PropertyUrl = new ServicePropertyPredefinition();
            PropertyUrl.AttributeName = "URL";
            PropertyUrl.AttributeType = "String";

            //add properties
            Website_VertexTypePredefinition.Properties.Add(PropertyName);
            Website_VertexTypePredefinition.Properties.Add(PropertyUrl);

            #region create an index on type "Website" on property "Name"


            var MyIndex = new ServiceIndexPredefinition();
            MyIndex.Name = "MyIndex";
            MyIndex.IndexType = "SonesIndex";
            MyIndex.Properties = new List<string>();
            MyIndex.Properties.Add("Name");
            MyIndex.VertexTypeName = "Website";

            //add index
            Website_VertexTypePredefinition.Indices.Add(MyIndex);

            #endregion

            //add IncomingEdge "Tags", the related OutgoingEdge is "TaggedWebsites" on type "Tag"
            ServiceIncomingEdgePredefinition Incoming = new ServiceIncomingEdgePredefinition();
            Incoming.AttributeName = "Tags";
            Incoming.AttributeType = "Tag";
            Incoming.OutgoingEdgeName = "TaggedWebsites";


            Website_VertexTypePredefinition.IncomingEdges.Add(Incoming);
            #endregion

            #region create types by sending requests

            //create the types "Tag" and "Website"

            var DBTypes = GraphDS_API.CreateVertexTypes(SecToken, TransToken, new List<ServiceVertexTypePredefinition>(){Tag_VertexTypePredefinition,
                    Website_VertexTypePredefinition});
            Console.WriteLine("CreateVertexTypes ('Websites', 'Tag') successful executed!");


            var Tag = DBTypes.Where(type => type.Name == "Tag").FirstOrDefault();

            var Website = DBTypes.Where(type => type.Name == "Website").FirstOrDefault();

            #endregion

            #region insert some Websites by sending requests

            ServiceInsertPayload Insert = new ServiceInsertPayload();
            Insert.StructuredProperties = new List<StructuredProperty>();
            Insert.UnstructuredProperties = new List<UnstructuredProperty>();

            StructuredProperty Property = new StructuredProperty();
            Property.PropertyName = "Name";
            Property.PropertyValue = "CNN";
            Insert.StructuredProperties.Add(Property);
            Property = new StructuredProperty();
            Property.PropertyName = "URL";
            Property.PropertyValue = "http://cnn.com/";
            Insert.StructuredProperties.Add(Property);

            var cnn = GraphDS_API.Insert(SecToken, TransToken, "Website", Insert);
            Console.WriteLine("Insert into 'Websites' successful executed!");

            Insert = new ServiceInsertPayload();
            Insert.StructuredProperties = new List<StructuredProperty>();
            Insert.UnstructuredProperties = new List<UnstructuredProperty>();
            Property = new StructuredProperty();
            Property.PropertyName = "Name";
            Property.PropertyValue = "xkcd";
            Insert.StructuredProperties.Add(Property);
            Property = new StructuredProperty();
            Property.PropertyName = "URL";
            Property.PropertyValue = "http://xkcd.com/";
            Insert.StructuredProperties.Add(Property);

            var xkcd = GraphDS_API.Insert(SecToken, TransToken, "Website", Insert);
            Console.WriteLine("Insert into 'Websites' successful executed!");

            Insert = new ServiceInsertPayload();
            Insert.StructuredProperties = new List<StructuredProperty>();
            Insert.UnstructuredProperties = new List<UnstructuredProperty>();
            Property = new StructuredProperty();
            Property.PropertyName = "Name";
            Property.PropertyValue = "onion";
            Insert.StructuredProperties.Add(Property);
            Property = new StructuredProperty();
            Property.PropertyName = "URL";
            Property.PropertyValue = "http://theonion.com/";
            Insert.StructuredProperties.Add(Property);


            var onion = GraphDS_API.Insert(SecToken, TransToken, "Website", Insert);
            Console.WriteLine("Insert into 'Websites' successful executed!");

            Insert = new ServiceInsertPayload();
            Insert.StructuredProperties = new List<StructuredProperty>();
            Insert.UnstructuredProperties = new List<UnstructuredProperty>();
            Property = new StructuredProperty();
            Property.PropertyName = "Name";
            Property.PropertyValue = "Test";
            Insert.StructuredProperties.Add(Property);
            Property = new StructuredProperty();
            Property.PropertyName = "URL";
            Property.PropertyValue = "";
            Insert.StructuredProperties.Add(Property);
            UnstructuredProperty UnsProp = new UnstructuredProperty();
            UnsProp.PropertyName = "IsValide";
            UnsProp.PropertyValue = false;
            Insert.UnstructuredProperties.Add(UnsProp);


            //adding an unstructured property means the property isn't defined before
            var test = GraphDS_API.Insert(SecToken, TransToken, "Website", Insert);
            Console.WriteLine("Insert into 'Websites' successful executed!");

            #endregion

            #region insert some Tags by sending requests

            //insert a "Tag" with an OutgoingEdge to a "Website" include that the GraphDB creates an IncomingEdge on the given Website instances
            //(because we created an IncomingEdge on type "Website") --> as a consequence we never have to set any IncomingEdge

            Insert = new ServiceInsertPayload();
            Insert.StructuredProperties = new List<StructuredProperty>();
            Insert.Edges = new List<ServiceEdgePredefinition>();
            Insert.UnstructuredProperties = new List<UnstructuredProperty>();

            Property = new StructuredProperty();
            Property.PropertyName = "Name";
            Property.PropertyValue = "good";
            Insert.StructuredProperties.Add(Property);

            ServiceEdgePredefinition Edge = new ServiceEdgePredefinition();
            Edge.EdgeName = "TaggedWebsites";
            Edge.ContainedEdges = new List<ServiceEdgePredefinition>();

            ServiceEdgePredefinition InnerEdge = new ServiceEdgePredefinition();
            InnerEdge.VertexIDsByID = new List<Tuple<long, long>>();
            InnerEdge.VertexIDsByID.Add(new Tuple<long, long>(Website.ID, cnn.VertexID));

            Edge.ContainedEdges.Add(InnerEdge);

            InnerEdge = new ServiceEdgePredefinition();
            InnerEdge.VertexIDsByID = new List<Tuple<long, long>>();
            InnerEdge.VertexIDsByID.Add(new Tuple<long, long>(Website.ID, xkcd.VertexID));

            Edge.ContainedEdges.Add(InnerEdge);

            Insert.Edges.Add(Edge);


            var good = GraphDS_API.Insert(SecToken, TransToken, "Tag", Insert);
            Console.WriteLine("Insert into 'Tag' successful executed!");

            Insert = new ServiceInsertPayload();
            Insert.StructuredProperties = new List<StructuredProperty>();
            Insert.Edges = new List<ServiceEdgePredefinition>();
            Insert.UnstructuredProperties = new List<UnstructuredProperty>();

            Property = new StructuredProperty();
            Property.PropertyName = "Name";
            Property.PropertyValue = "funny";
            Insert.StructuredProperties.Add(Property);

            Edge = new ServiceEdgePredefinition();
            Edge.EdgeName = "TaggedWebsites";
            Edge.ContainedEdges = new List<ServiceEdgePredefinition>();

            InnerEdge = new ServiceEdgePredefinition();
            InnerEdge.VertexIDsByID = new List<Tuple<long, long>>();
            InnerEdge.VertexIDsByID.Add(new Tuple<long, long>(Website.ID, xkcd.VertexID));

            Edge.ContainedEdges.Add(InnerEdge);

            InnerEdge = new ServiceEdgePredefinition();
            InnerEdge.VertexIDsByID = new List<Tuple<long, long>>();
            InnerEdge.VertexIDsByID.Add(new Tuple<long, long>(Website.ID, onion.VertexID));

            Edge.ContainedEdges.Add(InnerEdge);

            Insert.Edges.Add(Edge);

            var funny = GraphDS_API.Insert(SecToken, TransToken, "Tag", Insert);
            Console.WriteLine("Insert into 'Tag' successful executed!");



            #endregion
        }

        #endregion

        #region How to: Gather Data with TypeServices and InstanceServices
        
        private void GatherData()
        {
            #region Get VertexType from DB by Name
            
            //how to get a type from the DB
            var TagDBType = GraphDS_API.GetVertexType(SecToken, TransToken,"Tag");
            var WebsiteDBType = GraphDS_API.GetVertexType(SecToken, TransToken, "Website");

            #endregion

            #region Get VertexType definition information with VertexTypeService


            //read informations from type
            Console.WriteLine("Got vertex type name " + TagDBType.Name + " with ID " + TagDBType.ID);
            Console.WriteLine("Got vertex type name " + WebsiteDBType.Name + " with ID " + WebsiteDBType.ID);


            //are there other types wich extend the type "Tag" or "Website"
            var hasChildTypes = _VertexTypeService.HasChildTypeByVertexType(SecToken,TransToken,TagDBType);
            Console.WriteLine(TagDBType.Name + " HasChildTypes: " + hasChildTypes.ToString());
            hasChildTypes = _VertexTypeService.HasChildTypeByVertexType(SecToken, TransToken, WebsiteDBType);
            Console.WriteLine(WebsiteDBType.Name + " HasChildTypes: " + hasChildTypes.ToString());

            #region collect all Properties on VertexType "Tag" and "Website"

            var TagPropertyList = _VertexTypeService.GetPropertyDefinitionsByVertexType(SecToken, TransToken,TagDBType, false);
            var WebsitePropertyList = _VertexTypeService.GetPropertyDefinitionsByVertexType(SecToken, TransToken, WebsiteDBType, false);
            
            Console.WriteLine(Environment.NewLine);
            Console.WriteLine("Properties of VertexType 'Tag'");
            foreach (var Property in TagPropertyList)
            {
                Console.WriteLine(Property.Name + " : " + Property.BaseType.Substring(0, Property.BaseType.IndexOf(',')) + "| IsMandatory: "
                    + Property.IsMandatory.ToString() + "| ID: " + Property.ID.ToString());
                
            }
            Console.WriteLine(Environment.NewLine);
            
            Console.WriteLine("Properties of VertexType 'Website'");
            foreach (var Property in WebsitePropertyList)
            {
                Console.WriteLine(Property.Name + " : " + Property.BaseType.Substring(0, Property.BaseType.IndexOf(',')) + "| IsMandatory: "
                    + Property.IsMandatory.ToString() + "| ID: " + Property.ID.ToString());

            }
            Console.WriteLine(Environment.NewLine);
            #endregion

            //are there any IncomingEdges
            var TagIncoming = _VertexTypeService.HasIncomingEdges(SecToken, TransToken, TagDBType, false);
            var WebsiteIncoming = _VertexTypeService.HasIncomingEdges(SecToken, TransToken, WebsiteDBType, false);
            Console.WriteLine(TagDBType.Name + "  HasIncomingEdges:  " + TagIncoming);
            Console.WriteLine(WebsiteDBType.Name + "  HasIncomingEdges:  " + WebsiteIncoming);
            Console.WriteLine(Environment.NewLine);


            //todo add some VertexTypeService functions

            #endregion
                       
            #region Get Vertex Instance information with VertexInstanceService
            
            //get a specific property definition
            var TagPropName = _VertexTypeService.GetPropertyDefinitionByVertexType(SecToken, TransToken, TagDBType, "Name");
            var WebPropName = _VertexTypeService.GetPropertyDefinitionByVertexType(SecToken, TransToken, WebsiteDBType, "Name");
                      
            var WebPropURL = _VertexTypeService.GetPropertyDefinitionByVertexType(SecToken, TransToken, WebsiteDBType, "URL");
            var TagWebsite = _VertexTypeService.GetOutgoingEdgeDefinitionByVertexType(SecToken, TransToken, TagDBType, "TaggedWebsites");

            #region Get all instances of the VertexTypes
            
            //how to get all instances of a type  from the DB
            Stopwatch watch1 = Stopwatch.StartNew();
            var TagInstances = GraphDS_API.GetVerticesByType(SecToken, TransToken,TagDBType);
            watch1.Stop();
            Console.WriteLine(watch1.Elapsed.TotalMilliseconds);

            watch1.Reset();
            watch1.Start();
            TagInstances = GraphDS_API.GetVerticesByType(SecToken, TransToken, TagDBType);
            watch1.Stop();
            Console.WriteLine(watch1.Elapsed.TotalMilliseconds);
            var WebsiteInstances = GraphDS_API.GetVerticesByType(SecToken, TransToken, WebsiteDBType);
            
            #endregion

            #region Iterate over all instances

            Console.WriteLine("Collect all vertex instances of type " + WebsiteDBType.Name + ":");
            foreach (var item in WebsiteInstances)
            {
                //to get the value of a property of an instance, you need the property ID 
                //(that's why we fetched the type from DB an read out the property definition of property "Name")
                var name = _VertexInstanceService.GetPropertyAsStringByVertexInstance(SecToken, TransToken, item, WebPropName.ID);
                var url = _VertexInstanceService.GetPropertyAsStringByVertexInstance(SecToken, TransToken, item, WebPropURL.ID);

                Console.WriteLine("Vertex instance: " + name + " | URL: " + url);
            }

            Console.WriteLine(Environment.NewLine);
            Console.WriteLine("Collect all vertex instances of type " + TagDBType.Name + ":");
            foreach (var item in TagInstances)
            {
                var vertexname = _VertexInstanceService.GetPropertyAsStringByVertexInstance(SecToken, TransToken, item, TagPropName.ID);
                var edges = _VertexInstanceService.GetOutgoingHyperEdge(SecToken, TransToken, item, TagWebsite.ID).SingleEdges;
                Console.Write(vertexname + " points to: ");
                foreach (var edge in edges)
                {
                    var name = _VertexInstanceService.GetPropertyAsStringByVertexInstance(SecToken, TransToken, edge.TargetVertex, WebPropName.ID);
                    Console.Write(" |-->" + name + " ");
                }
                
                Console.Write(Environment.NewLine);
            }

            

            
            #endregion

            #region How to use Expressions to filter like a 'Where'

            //We want to search through an property
            var PropExpression = new ServicePropertyExpression();
            PropExpression.NameOfProperty = "Name";
            PropExpression.NameOfVertexType = "Website";

            //Single Constances are SingleLiteralExpression, there are also Range and Multiple Literals
            var SingleExpression = new ServiceSingleLiteralExpression();
            SingleExpression.Constant = "CNN";
            

            //BinaryExpression With a Left Statement, an Operator and a Right Statement
            var BinExpression = new ServiceBinaryExpression();
            BinExpression.Right = PropExpression;
            BinExpression.Left = SingleExpression;
            BinExpression.Operator = ServiceBinaryOperator.Equals;

            //In this case we query the Vertices "Where Name = 'CNN'". That's just one vertex ;)
            var a = GraphDS_API.GetVerticesByExpression(SecToken, TransToken, BinExpression);
            Console.WriteLine("\r\nExpression was: Name(Property) = (Equals) 'CNN'");
            Console.WriteLine("Expression Result: " + a.Count + " affected Vertices");

            #endregion

            


            #endregion
        }
        #endregion

    }
}
