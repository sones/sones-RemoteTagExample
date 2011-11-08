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

package testing;

import java.rmi.RemoteException;

import org.datacontract.schemas._2004._07.sones_library_commons.SecurityToken;
import org.datacontract.schemas._2004._07.system.ArrayOfTupleOflongArrayOflongty7Ep6D1;
import org.datacontract.schemas._2004._07.system.TupleOflongArrayOflongty7Ep6D1;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.sones.ArrayOfServiceEdgePredefinition;
import com.sones.ArrayOfServiceIncomingEdgePredefinition;
import com.sones.ArrayOfServiceIndexPredefinition;
import com.sones.ArrayOfServiceOutgoingEdgePredefinition;
import com.sones.ArrayOfServicePropertyDefinition;
import com.sones.ArrayOfServicePropertyPredefinition;
import com.sones.ArrayOfServiceSingleEdgeInstance;
import com.sones.ArrayOfServiceVertexInstance;
import com.sones.ArrayOfServiceVertexType;
import com.sones.ArrayOfServiceVertexTypePredefinition;
import com.sones.ArrayOfStructuredProperty;
import com.sones.ArrayOfUnstructuredProperty;
import com.sones.GraphDSService;
import com.sones.RPCServiceContract;
import com.sones.ServiceBinaryExpression;
import com.sones.ServiceBinaryOperator;
import com.sones.ServiceEdgeMultiplicity;
import com.sones.ServiceEdgePredefinition;
import com.sones.ServiceIncomingEdgePredefinition;
import com.sones.ServiceIndexPredefinition;
import com.sones.ServiceInsertPayload;
import com.sones.ServiceOutgoingEdgeDefinition;
import com.sones.ServiceOutgoingEdgePredefinition;
import com.sones.ServicePropertyDefinition;
import com.sones.ServicePropertyExpression;
import com.sones.ServicePropertyPredefinition;
import com.sones.ServiceSingleEdgeInstance;
import com.sones.ServiceSingleLiteralExpression;
import com.sones.ServiceUserPasswordCredentials;
import com.sones.ServiceVertexInstance;
import com.sones.ServiceVertexType;
import com.sones.ServiceVertexTypePredefinition;
import com.sones.StructuredProperty;
import com.sones.UnstructuredProperty;
import com.sones.VertexInstanceService;
import com.sones.VertexTypeService;

public class RemoteTagExample {
	private RPCServiceContract _ServiceContract;
	private GraphDSService _GraphDSService;
	private VertexInstanceService _VertexInstanceService;
    private VertexTypeService _VertexTypeService;

    private SecurityToken _SecToken;
    private long _TransToken;
	
    public static void main(String[] args) {
		RemoteTagExample app = new RemoteTagExample();
		app.run();
	}
    
	public RemoteTagExample()
	{
		_ServiceContract = new RPCServiceContract();
		_GraphDSService = _ServiceContract.getSonesBasicGraphDSService();
		_VertexInstanceService = _ServiceContract.getSonesBasicVertexInstanceService();
		_VertexTypeService = _ServiceContract.getSonesBasicVertexTypeService();
	}
	
	public void run()
	{

		try {
			// for each request, you need an SecurityToken and a Int64
			ServiceUserPasswordCredentials cred = new ServiceUserPasswordCredentials();
			cred.setLogin("test");
			cred.setPasswordHash("test".hashCode());
			_SecToken = _GraphDSService.logOn(cred);
			_TransToken = _GraphDSService.beginTransaction(_SecToken);
	
			// clear the database
			_GraphDSService.clear(_SecToken, _TransToken);
			
			long startTime = System.currentTimeMillis();
		
			System.out.println("_________Generate DB Content:___________________________");
			generateDBContent();
			System.out.println();
	        
			System.out.println("_________Gather some data out of the DB:________________");
			GatherData();
			System.out.println();
			
			System.out.println("________Example successful executed in " + (System.currentTimeMillis() - startTime) + " ms!______________");			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	private void generateDBContent() throws RemoteException
	{
		/*
		 * How to: Create Vertex Types / Insert Data into Vertices
		 */
		
		// create a VertexTypePredefinition
		ServiceVertexTypePredefinition Tag_VertexTypePredefinition = new ServiceVertexTypePredefinition();
        Tag_VertexTypePredefinition.setVertexTypeName("Tag");

        // create property
        ServicePropertyPredefinition PropertyName = new ServicePropertyPredefinition();
        PropertyName.setAttributeName("Name");
        PropertyName.setAttributeType("String");
        PropertyName.setComment("This is a property on type 'Tag' named 'Name' and is of type 'String'");

        // add property
        ArrayOfServicePropertyPredefinition propertyPredefs = new ArrayOfServicePropertyPredefinition();
        propertyPredefs.getServicePropertyPredefinition().add(PropertyName);
        Tag_VertexTypePredefinition.setProperties(propertyPredefs);

        // create outgoing edge to "Website"
        ServiceOutgoingEdgePredefinition OutgoingEdgesTaggedWebsites = new ServiceOutgoingEdgePredefinition();
        OutgoingEdgesTaggedWebsites.setAttributeName("TaggedWebsites");
        OutgoingEdgesTaggedWebsites.setAttributeType("Website");
        OutgoingEdgesTaggedWebsites.setMultiplicity(ServiceEdgeMultiplicity.MULTI_EDGE);
        OutgoingEdgesTaggedWebsites.setComment("This is an outgoing edge on type 'Tag' wich points to the type 'Website' (the AttributeType) and is defined as 'MultiEdge', which means that this edge can contain multiple single edges");

        // add outgoing edge
        ArrayOfServiceOutgoingEdgePredefinition outgoingEdgePredefs = new ArrayOfServiceOutgoingEdgePredefinition();
        outgoingEdgePredefs.getServiceOutgoingEdgePredefinition().add(OutgoingEdgesTaggedWebsites);
        Tag_VertexTypePredefinition.setOutgoingEdges(outgoingEdgePredefs);

        
        
        /*
         *  define type "Website"
         */
        
        // create a VertexTypePredefinition
        ServiceVertexTypePredefinition Website_VertexTypePredefinition = new ServiceVertexTypePredefinition();
        Website_VertexTypePredefinition.setVertexTypeName("Website");
        
        // create properties
        PropertyName = new ServicePropertyPredefinition();
        PropertyName.setAttributeName("Name");
        PropertyName.setAttributeType("String");
        PropertyName.setComment("This is a property on type 'Website' named 'Name' and is of type 'String'");
        ServicePropertyPredefinition PropertyUrl = new ServicePropertyPredefinition();
        PropertyUrl.setAttributeName("URL");
        PropertyUrl.setAttributeType("String");
        
        // add properties
        propertyPredefs = new ArrayOfServicePropertyPredefinition();
        propertyPredefs.getServicePropertyPredefinition().add(PropertyName);
        propertyPredefs.getServicePropertyPredefinition().add(PropertyUrl);
        Website_VertexTypePredefinition.setProperties(propertyPredefs);
        
        // create an index on type "Website" on property "Name"
        ServiceIndexPredefinition MyIndex = new ServiceIndexPredefinition();
        MyIndex.setName("MyIndex");
        MyIndex.setIndexType("SonesIndex");
        ArrayOfstring properties = new ArrayOfstring();
        properties.getString().add("Name");
        MyIndex.setProperties(properties);
        MyIndex.setVertexTypeName("Website");
        
        // add index
        ArrayOfServiceIndexPredefinition indexPredefs = new ArrayOfServiceIndexPredefinition();
        indexPredefs.getServiceIndexPredefinition().add(MyIndex);
        Website_VertexTypePredefinition.setIndices(indexPredefs);
     
        // add IncomingEdge "Tags", the related OutgoingEdge is "TaggedWebsites" on type "Tag"
        ServiceIncomingEdgePredefinition Incoming = new ServiceIncomingEdgePredefinition();
        Incoming.setAttributeName("Tags");
        Incoming.setAttributeType("Tag");
        Incoming.setOutgoingEdgeName("TaggedWebsites");
        ArrayOfServiceIncomingEdgePredefinition incomingEdgePredefs = new ArrayOfServiceIncomingEdgePredefinition();
        incomingEdgePredefs.getServiceIncomingEdgePredefinition().add(Incoming);
        Website_VertexTypePredefinition.setIncomingEdges(incomingEdgePredefs);
        
        
        
        /*
         * create the types "Tag" and "Website"
         */
        ArrayOfServiceVertexTypePredefinition vertexTypePredefs = new ArrayOfServiceVertexTypePredefinition();
        vertexTypePredefs.getServiceVertexTypePredefinition().add(Tag_VertexTypePredefinition);
        vertexTypePredefs.getServiceVertexTypePredefinition().add(Website_VertexTypePredefinition);
        ArrayOfServiceVertexType DBTypes = _GraphDSService.createVertexTypes(_SecToken, _TransToken, vertexTypePredefs);
        System.out.println("CreateVertexTypes ('Websites', 'Tag') successful executed!");

        ServiceVertexType Tag = null, Website = null;
        for(ServiceVertexType item : DBTypes.getServiceVertexType())
        {
        	if(item.getName().equals("Tag"))
        	{
        		Tag = item;
        	}
        	else if(item.getName().equals("Website"))
        	{
        		Website = item;
        	}
        }

        
        
        /*
         *  insert some Websites by sending requests
         */
        // create payload object and properties
        ServiceInsertPayload Insert = new ServiceInsertPayload();
        StructuredProperty Property1 = new StructuredProperty();
        Property1.setPropertyName("Name");
        Property1.setPropertyValue("CNN");
        StructuredProperty Property2 = new StructuredProperty();
        Property2.setPropertyName("URL");
        Property2.setPropertyValue("http://cnn.com/");
        // add properties
        ArrayOfStructuredProperty structuredProperties = new ArrayOfStructuredProperty();
        structuredProperties.getStructuredProperty().add(Property1);
        structuredProperties.getStructuredProperty().add(Property2);
        Insert.setStructuredProperties(structuredProperties);
        // execute query
        ServiceVertexInstance cnn = _GraphDSService.insert(_SecToken, _TransToken, "Website", Insert);
        System.out.println("Insert CNN into 'Websites' successful executed!");
        
        Insert = new ServiceInsertPayload();
        Property1 = new StructuredProperty();
        Property1.setPropertyName("Name");
        Property1.setPropertyValue("xkcd");
        Property2 = new StructuredProperty();
        Property2.setPropertyName("URL");
        Property2.setPropertyValue("http://xkcd.com/");
        structuredProperties = new ArrayOfStructuredProperty();
        structuredProperties.getStructuredProperty().add(Property1);
        structuredProperties.getStructuredProperty().add(Property2);
        Insert.setStructuredProperties(structuredProperties);
        ServiceVertexInstance xkcd = _GraphDSService.insert(_SecToken, _TransToken, "Website", Insert);
        System.out.println("Insert xkcd into 'Websites' successful executed!");
        
        Insert = new ServiceInsertPayload();
        Property1 = new StructuredProperty();
        Property1.setPropertyName("Name");
        Property1.setPropertyValue("onion");
        Property2 = new StructuredProperty();
        Property2.setPropertyName("URL");
        Property2.setPropertyValue("http://theonion.com/");
        structuredProperties = new ArrayOfStructuredProperty();
        structuredProperties.getStructuredProperty().add(Property1);
        structuredProperties.getStructuredProperty().add(Property2);
        Insert.setStructuredProperties(structuredProperties);
        ServiceVertexInstance onion = _GraphDSService.insert(_SecToken, _TransToken, "Website", Insert);
        System.out.println("Insert onion into 'Websites' successful executed!");
        
        Insert = new ServiceInsertPayload();
        Property1 = new StructuredProperty();
        Property1.setPropertyName("Name");
        Property1.setPropertyValue("Test");
        Property2 = new StructuredProperty();
        Property2.setPropertyName("URL");
        Property2.setPropertyValue("");
        UnstructuredProperty Property3 = new UnstructuredProperty();
        Property3.setPropertyName("IsValide");
        Property3.setPropertyValue(false);
        structuredProperties = new ArrayOfStructuredProperty();
        structuredProperties.getStructuredProperty().add(Property1);
        structuredProperties.getStructuredProperty().add(Property2);
        Insert.setStructuredProperties(structuredProperties);
        // adding an unstructured property means the property isn't defined before
        ArrayOfUnstructuredProperty unstructuredProperties = new ArrayOfUnstructuredProperty();
        unstructuredProperties.getUnstructuredProperty().add(Property3);
        Insert.setUnstructuredProperties(unstructuredProperties);
        ServiceVertexInstance test = _GraphDSService.insert(_SecToken, _TransToken, "Website", Insert);
        System.out.println("Insert test into 'Websites' successful executed!");
        
        
        
        /*
         * insert a "Tag" with an OutgoingEdge to a "Website" include that the GraphDB creates an IncomingEdge on the given Website instances
         * (because we created an IncomingEdge on type "Website") --> as a consequence we never have to set any IncomingEdge 
         */
        
        /*
         * create new edge
         */
        Insert = new ServiceInsertPayload();
        StructuredProperty Property = new StructuredProperty();
        Property.setPropertyName("Name");
        Property.setPropertyValue("good");
        structuredProperties = new ArrayOfStructuredProperty();
        structuredProperties.getStructuredProperty().add(Property);
        Insert.setStructuredProperties(structuredProperties);

        ServiceEdgePredefinition Edge = new ServiceEdgePredefinition();
        Edge.setEdgeName("TaggedWebsites");
        ArrayOfServiceEdgePredefinition innerEdgePredefs = new ArrayOfServiceEdgePredefinition();
        
        // add edges
        ServiceEdgePredefinition InnerEdge = new ServiceEdgePredefinition();
        ArrayOfTupleOflongArrayOflongty7Ep6D1 arrayOfTuples = new ArrayOfTupleOflongArrayOflongty7Ep6D1();
        
        TupleOflongArrayOflongty7Ep6D1 tupleOfIDs = new TupleOflongArrayOflongty7Ep6D1();
        ArrayOflong arrayOfIDs = new ArrayOflong();
        arrayOfIDs.getLong().add(cnn.getVertexID());
        arrayOfIDs.getLong().add(xkcd.getVertexID());
        tupleOfIDs.setMItem2(arrayOfIDs);
        tupleOfIDs.setMItem1(Website.getID());
        
        arrayOfTuples.getTupleOflongArrayOflongty7Ep6D1().add(tupleOfIDs);
        InnerEdge.setVertexIDsByID(arrayOfTuples);
        innerEdgePredefs.getServiceEdgePredefinition().add(InnerEdge);

        // execute query
        Edge.setContainedEdges(innerEdgePredefs);
        ArrayOfServiceEdgePredefinition edgePredefs = new ArrayOfServiceEdgePredefinition();
        edgePredefs.getServiceEdgePredefinition().add(Edge);
        Insert.setEdges(edgePredefs);

        ServiceVertexInstance good = _GraphDSService.insert(_SecToken, _TransToken, "Tag", Insert);
        System.out.println("Insert 'good' into 'Tag' successful executed!");
     
        /*
         * create new edge
         */
        Insert = new ServiceInsertPayload();
        Property = new StructuredProperty();
        Property.setPropertyName("Name");
        Property.setPropertyValue("funny");
        structuredProperties = new ArrayOfStructuredProperty();
        structuredProperties.getStructuredProperty().add(Property);
        Insert.setStructuredProperties(structuredProperties);
        
        Edge = new ServiceEdgePredefinition();
        Edge.setEdgeName("TaggedWebsites");
        innerEdgePredefs = new ArrayOfServiceEdgePredefinition();
        
        // add edges
        InnerEdge = new ServiceEdgePredefinition();
        arrayOfTuples = new ArrayOfTupleOflongArrayOflongty7Ep6D1();
        
        tupleOfIDs = new TupleOflongArrayOflongty7Ep6D1();
        arrayOfIDs = new ArrayOflong();
        arrayOfIDs.getLong().add(xkcd.getVertexID());
        arrayOfIDs.getLong().add(onion.getVertexID());
        tupleOfIDs.setMItem2(arrayOfIDs);
        tupleOfIDs.setMItem1(Website.getID());
        
        arrayOfTuples.getTupleOflongArrayOflongty7Ep6D1().add(tupleOfIDs);
        InnerEdge.setVertexIDsByID(arrayOfTuples);
        innerEdgePredefs.getServiceEdgePredefinition().add(InnerEdge);
        
        // execute query
        Edge.setContainedEdges(innerEdgePredefs);
        edgePredefs = new ArrayOfServiceEdgePredefinition();
        edgePredefs.getServiceEdgePredefinition().add(Edge);
        Insert.setEdges(edgePredefs);
        
        ServiceVertexInstance funny = _GraphDSService.insert(_SecToken, _TransToken, "Tag", Insert);
        System.out.println("Insert 'funny' into 'Tag' successful executed!");
	}
	
	private void GatherData()
	{
		/*
		 * How to: Gather Data with TypeServices and InstanceServices
		 */
		
		//how to get a type from the DB
        ServiceVertexType TagDBType = _GraphDSService.getVertexTypeByName(_SecToken, _TransToken,"Tag");
        ServiceVertexType WebsiteDBType = _GraphDSService.getVertexTypeByName(_SecToken, _TransToken, "Website");
        
        
        
        /*
         * Get VertexType definition information with VertexTypeService
         */
        
        // read informations from type
        System.out.println("Got vertex type name " + TagDBType.getName() + " with ID " + TagDBType.getID());
        System.out.println("Got vertex type name " + WebsiteDBType.getName() + " with ID " + WebsiteDBType.getID());
        
        // are there other types wich extend the type "Tag" or "Website"
        boolean hasChildTypes = _VertexTypeService.hasChildTypeByVertexType(_SecToken,_TransToken,TagDBType);
        System.out.println(TagDBType.getName() + " HasChildTypes: " + hasChildTypes);
        hasChildTypes = _VertexTypeService.hasChildTypeByVertexType(_SecToken, _TransToken, WebsiteDBType);
        System.out.println(WebsiteDBType.getName() + " HasChildTypes: " + hasChildTypes);
        
        // collect all Properties on VertexType "Tag" and "Website"
        ArrayOfServicePropertyDefinition TagPropertyList = _VertexTypeService.getPropertyDefinitionsByVertexType(_SecToken, _TransToken, TagDBType.getName(), false);
        ArrayOfServicePropertyDefinition WebsitePropertyList = _VertexTypeService.getPropertyDefinitionsByVertexType(_SecToken, _TransToken, WebsiteDBType.getName(), false);
        
        System.out.println();
        System.out.println("Properties of VertexType 'Tag'");
        for (ServicePropertyDefinition Property : TagPropertyList.getServicePropertyDefinition())
        {
            System.out.println(Property.getName() + " : " + Property.getBaseType().substring(0, Property.getBaseType().indexOf(',')) + "| IsMandatory: " + Property.isIsMandatory().toString() + "| ID: " + Property.getID().toString());
        }
        
        System.out.println();
        System.out.println("Properties of VertexType 'Website'");
        for (ServicePropertyDefinition Property : WebsitePropertyList.getServicePropertyDefinition())
        {
            System.out.println(Property.getName() + " : " + Property.getBaseType().substring(0, Property.getBaseType().indexOf(',')) + "| IsMandatory: " + Property.isIsMandatory().toString() + "| ID: " + Property.getID().toString());
        }

        //are there any IncomingEdges
        boolean TagIncoming = _VertexTypeService.hasIncomingEdges(_SecToken, _TransToken, TagDBType, false);
        boolean WebsiteIncoming = _VertexTypeService.hasIncomingEdges(_SecToken, _TransToken, WebsiteDBType, false);
        System.out.println(TagDBType.getName() + "  HasIncomingEdges:  " + TagIncoming);
        System.out.println(WebsiteDBType.getName() + "  HasIncomingEdges:  " + WebsiteIncoming);
        System.out.println();

        
                   
        /*
         * Get Vertex Instance information with VertexInstanceService
         */
        
        //get a specific property definition
        ServicePropertyDefinition TagPropName = _VertexTypeService.getPropertyDefinitionByVertexType(_SecToken, _TransToken, TagDBType.getName(), "Name");
        ServicePropertyDefinition WebPropName = _VertexTypeService.getPropertyDefinitionByVertexType(_SecToken, _TransToken, WebsiteDBType.getName(), "Name");
                  
        ServicePropertyDefinition WebPropURL = _VertexTypeService.getPropertyDefinitionByVertexType(_SecToken, _TransToken, WebsiteDBType.getName(), "URL");
        ServiceOutgoingEdgeDefinition TagWebsite = _VertexTypeService.getOutgoingEdgeDefinitionByVertexType(_SecToken, _TransToken, TagDBType, "TaggedWebsites");

        
        
        /*
         * Get all instances of the VertexTypes
         */
        
        //how to get all instances of a type  from the DB
        ArrayOfServiceVertexInstance TagInstances = _GraphDSService.getVerticesByType(_SecToken, _TransToken,TagDBType);
        ArrayOfServiceVertexInstance WebsiteInstances = _GraphDSService.getVerticesByType(_SecToken, _TransToken, WebsiteDBType);

        
        
        /*
         * Iterate over all instances
         */
        System.out.println("Collect all vertex instances of type " + WebsiteDBType.getName() + ":");
        for (ServiceVertexInstance item : WebsiteInstances.getServiceVertexInstance())
        {
            // to get the value of a property of an instance, you need the property ID 
            // (that's why we fetched the type from DB an read out the property definition of property "Name")
            String name = _VertexInstanceService.getPropertyAsStringByVertexInstance(_SecToken, _TransToken, item, WebPropName.getID());
            String url = _VertexInstanceService.getPropertyAsStringByVertexInstance(_SecToken, _TransToken, item, WebPropURL.getID());
            System.out.println("Vertex instance: " + name + " | URL: " + url);
        }

        System.out.println("Collect all vertex instances of type " + TagDBType.getName() + ":");
        for (ServiceVertexInstance item : TagInstances.getServiceVertexInstance())
        {
            String vertexname = _VertexInstanceService.getPropertyAsStringByVertexInstance(_SecToken, _TransToken, item, TagPropName.getID());
            ArrayOfServiceSingleEdgeInstance edges = _VertexInstanceService.getOutgoingHyperEdge(_SecToken, _TransToken, item, TagWebsite.getID()).getSingleEdges();
            System.out.println(vertexname + " points to: ");
            for (ServiceSingleEdgeInstance edge : edges.getServiceSingleEdgeInstance())
            {
                String name = _VertexInstanceService.getPropertyAsStringByVertexInstance(_SecToken, _TransToken, edge.getTargetVertex(), WebPropName.getID());
                System.out.print(" |-->" + name + " ");
            }
            System.out.println();
        }
        
        
        
        /*
         *  How to use Expressions to filter like a 'Where'
         */
        
        // We want to search through an property
        ServicePropertyExpression PropExpression = new ServicePropertyExpression();
        PropExpression.setNameOfProperty("Name");
        PropExpression.setNameOfVertexType("Website");
        
        // Single Constances are SingleLiteralExpression, there are also Range and Multiple Literals
        ServiceSingleLiteralExpression SingleExpression = new ServiceSingleLiteralExpression();
        SingleExpression.setConstant("CNN");
        
        // BinaryExpression With a Left Statement, an Operator and a Right Statement
        ServiceBinaryExpression binExpression = new ServiceBinaryExpression();
        binExpression.setLeft(SingleExpression);
        binExpression.setRight(PropExpression);
        binExpression.setOperator(ServiceBinaryOperator.EQUALS);
        
        // In this case we query the Vertices "Where Name = 'CNN'". That's just one vertex ;)
        ArrayOfServiceVertexInstance result =  _GraphDSService.getVerticesByExpression(_SecToken, _TransToken, binExpression);
        ServiceVertexInstance cnn = result.getServiceVertexInstance().get(0);
        System.out.println("\r\nExpression was: Name(Property) = (Equals) 'CNN'");
        System.out.println("Expression Result: " + result.getServiceVertexInstance().size() + " affected Vertices");
	}
	
	

}
