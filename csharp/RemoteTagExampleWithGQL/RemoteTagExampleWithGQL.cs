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
using System.ServiceModel;

namespace RemoteTagExampleWithGQL
{
    class RemoteTagExampleWithGQL
    {
        #region Data

        private GraphDSService _GraphDS_Service;
        private VertexInstanceService _VertexInstanceService;
        private VertexTypeService _VertexTypeService;
        private EdgeInstanceService _EdgeInstanceService;
        private EdgeTypeService _EdgeTypeService;

        private SecurityToken SecToken;
        private Int64 TransToken;

        #endregion

        static void Main(string[] args)
        {
            RemoteTagExampleWithGQL example = new RemoteTagExampleWithGQL("http://localhost:9970/rpc");
            example.run();
        }

        public RemoteTagExampleWithGQL(String myUri)
        {
            var Binding = new BasicHttpBinding();
            Binding.Name = "sonesBasic";
            var Uri = new EndpointAddress(myUri);

            _GraphDS_Service = ChannelFactory<GraphDSService>.CreateChannel(Binding, Uri);
            _VertexInstanceService = ChannelFactory<VertexInstanceService>.CreateChannel(Binding, Uri);
            _VertexTypeService = ChannelFactory<VertexTypeService>.CreateChannel(Binding, Uri);
            _EdgeInstanceService = ChannelFactory<EdgeInstanceService>.CreateChannel(Binding, Uri);
            _EdgeTypeService = ChannelFactory<EdgeTypeService>.CreateChannel(Binding, Uri);
        }

        public void run()
        {
            //for each request, you need an SecurityToken and a Int64
            var cred = new ServiceUserPasswordCredentials();
            cred._login = "test";
            cred._passwordHash = "test".GetHashCode();
            SecToken = _GraphDS_Service.LogOn(cred);
            TransToken = _GraphDS_Service.BeginTransaction(SecToken);

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
                    _GraphDS_Service.Clear(SecToken, TransToken);
                    Console.WriteLine("GraphDB successful cleared!");
                    break;
                default:
                    break;
            }

            Console.WriteLine("Press <Any Key> to end GraphDB Remote API Example!");
            Console.ReadLine();
        }

        /// <summary>
        /// This private method analyses the QueryResult, shows the ResultType and Errors if existing.
        /// </summary>
        /// <param name="myQueryResult">The result of a query.</param>
        private bool CheckResult(ServiceQueryResult myQueryResult)
        {
            if (myQueryResult.Error != null)
            {
                Console.WriteLine(myQueryResult.Error);
                return false;
            }
            else
            {
                Console.WriteLine("Query " + myQueryResult.TypeOfResult);
                return true;
            }
        }

        #region How to: Create Vertex Types / Insert Data into Vertices

        private void GenerateDBContent()
        {
            #region create types
            //create types at the same time, because of the circular dependencies (Tag has OutgoingEdge to Website, Website has IncomingEdge from Tag)
            //like shown before, using the GraphQL there are also three different ways to create create an index on property "Name" of type "Website"
            //1. create an index definition and specifie the property name and index type
            var Types = _GraphDS_Service.Query(SecToken, TransToken, @"CREATE VERTEX TYPES Tag ATTRIBUTES (String Name, SET<Website> TaggedWebsites), 
                                                                                Website ATTRIBUTES (String Name, String URL) INCOMINGEDGES (Tag.TaggedWebsites Tags) 
                                                                                    INDICES (MyIndex INDEXTYPE SonesIndex ON ATTRIBUTES Name)", "sones.gql");

            //2. on creating the type with the property "Name", just define the property "Name" under INDICES
            //var Types = _GraphDS_Service.Query(SecToken, TransToken, @"CREATE VERTEX TYPES Tag ATTRIBUTES (String Name, SET<Website> TaggedWebsites), 
            //                                                                    Website ATTRIBUTES (String Name, String URL) INCOMINGEDGES (Tag.TaggedWebsites Tags) INDICES (Name)");

            //3. make a create index query
            //var Types = _GraphDS_Service.Query(SecToken, TransToken, @"CREATE VERTEX TYPES Tag ATTRIBUTES (String Name, SET<Website> TaggedWebsites), 
            //                                                                    Website ATTRIBUTES (String Name, String URL) INCOMINGEDGES (Tag.TaggedWebsites Tags)");
            //var MyIndex = _GraphDS_Service.Query(SecToken, TransToken, "CREATE INDEX MyIndex ON VERTEX TYPE Website (Name) INDEXTYPE SonesIndex");            
            CheckResult(Types);
            #endregion

            #region create instances of type "Website"

            var cnnResult = _GraphDS_Service.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'CNN', URL = 'http://cnn.com/')", "sones.gql");
            CheckResult(cnnResult);

            var xkcdResult = _GraphDS_Service.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'xkcd', URL = 'http://xkcd.com/')", "sones.gql");
            CheckResult(xkcdResult);

            var onionResult = _GraphDS_Service.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'onion', URL = 'http://theonion.com/')", "sones.gql");
            CheckResult(onionResult);

            //adding an unknown property ("Unknown") means the property isn't defined before
            var unknown = _GraphDS_Service.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'Test', URL = '', Unknown = 'unknown property')", "sones.gql");
            CheckResult(onionResult);

            #endregion

            #region create instances of type "Tag"

            var goodResult = _GraphDS_Service.Query(SecToken, TransToken, "INSERT INTO Tag VALUES (Name = 'good', TaggedWebsites = SETOF(Name = 'CNN', Name = 'xkcd'))", "sones.gql");
            CheckResult(goodResult);

            var funnyResult = _GraphDS_Service.Query(SecToken, TransToken, "INSERT INTO Tag VALUES (Name = 'funny', TaggedWebsites = SETOF(Name = 'xkcd', Name = 'onion'))", "sones.gql");
            CheckResult(funnyResult);

            #endregion
        }

        #endregion

        #region How to: Gather Data with TypeServices and InstanceServices

        private void GatherData()
        {
            #region Get VertexType from DB by Name

            // find out which tags xkcd is tagged with
            var _xkcdtags = _GraphDS_Service.Query(SecToken, TransToken, "FROM Website w SELECT w.Tags WHERE w.Name = 'xkcd' DEPTH 1", "sones.gql");

            CheckResult(_xkcdtags);

            foreach (var _tag in _xkcdtags.Vertices)
                foreach (var _hyperEdge in _tag.HyperEdges)
                    if (_hyperEdge.Item1 == "Tags")
                        foreach (var _edge in _hyperEdge.Item2.Edges)
                            foreach(var _property in _edge.TargetVertex.Properties)
                                if(_property.Item1 == "Name")
                                    Console.WriteLine(_property.Item2.ToString());

            // List tagged sites names and the count of there tags
            var _taggedsites = _GraphDS_Service.Query(SecToken, TransToken, "FROM Website w SELECT w.Name, w.Tags.Count() AS Counter", "sones.gql");

            CheckResult(_taggedsites);

            foreach (var _sites in _taggedsites.Vertices)
            {
                String _name = "", _counter = "";
                foreach (var _property in _sites.Properties)
                {
                    if (_property.Item1 == "Name")
                        _name = _property.Item2.ToString();
                    else if (_property.Item1 == "Counter")
                        _counter = _property.Item2.ToString();
                }
                Console.WriteLine("{0} => {1}", _name, _counter);
            }

            // find out the URL's of the website of each Tag
            var _urls = _GraphDS_Service.Query(SecToken, TransToken, "FROM Tag t SELECT t.Name, t.TaggedWebsites.URL", "sones.gql");

            CheckResult(_urls);

            foreach (var _tag in _urls.Vertices)
            {
                String _name = "", _url = "";
                foreach (var _property in _tag.Properties)
                    if (_property.Item1 == "Name")
                        _name = _property.Item2.ToString();
                foreach (var _hyperEdge in _tag.HyperEdges)
                    if (_hyperEdge.Item1 == "TaggedWebsites")
                        foreach (var _edge in _hyperEdge.Item2.Edges)
                        {
                            foreach (var _property in _edge.TargetVertex.Properties)
                                if (_property.Item1 == "URL")
                                    _url = _property.Item2.ToString();
                            Console.WriteLine(_name + " - " + _url);
                        }
                            
            }

            #endregion
        }
        #endregion

    }
}
