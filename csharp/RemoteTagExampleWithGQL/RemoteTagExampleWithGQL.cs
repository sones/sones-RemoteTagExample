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

namespace RemoteTagExampleWithGQL
{
    class RemoteTagExampleWithGQL
    {
        #region Data

        private GraphDSClient GraphDS_API;
        private VertexInstanceServiceClient _VertexInstanceService;
        private VertexTypeServiceClient _VertexTypeService;
        private EdgeInstanceServiceClient _EdgeInstanceService;
        private EdgeTypeServiceClient _EdgeTypeService;

        private SecurityToken SecToken;
        private Int64 TransToken;

        #endregion

        public RemoteTagExampleWithGQL()
        {
            GraphDS_API = new GraphDSClient();
            _VertexInstanceService = new VertexInstanceServiceClient();
            _VertexTypeService = new VertexTypeServiceClient();
            _EdgeInstanceService = new EdgeInstanceServiceClient();
            _EdgeTypeService = new EdgeTypeServiceClient();
        }

        public void run()
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
            var Types = GraphDS_API.Query(SecToken, TransToken, @"CREATE VERTEX TYPES Tag ATTRIBUTES (String Name, SET<Website> TaggedWebsites), 
                                                                                Website ATTRIBUTES (String Name, String URL) INCOMINGEDGES (Tag.TaggedWebsites Tags) 
                                                                                    INDICES (MyIndex INDEXTYPE SonesIndex ON ATTRIBUTES Name)", "sones.gql");

            //2. on creating the type with the property "Name", just define the property "Name" under INDICES
            //var Types = GraphDS_API.Query(SecToken, TransToken, @"CREATE VERTEX TYPES Tag ATTRIBUTES (String Name, SET<Website> TaggedWebsites), 
            //                                                                    Website ATTRIBUTES (String Name, String URL) INCOMINGEDGES (Tag.TaggedWebsites Tags) INDICES (Name)");

            //3. make a create index query
            //var Types = GraphDS_API.Query(SecToken, TransToken, @"CREATE VERTEX TYPES Tag ATTRIBUTES (String Name, SET<Website> TaggedWebsites), 
            //                                                                    Website ATTRIBUTES (String Name, String URL) INCOMINGEDGES (Tag.TaggedWebsites Tags)");
            //var MyIndex = GraphDS_API.Query(SecToken, TransToken, "CREATE INDEX MyIndex ON VERTEX TYPE Website (Name) INDEXTYPE SonesIndex");            
            CheckResult(Types);
            #endregion

            #region create instances of type "Website"

            var cnnResult = GraphDS_API.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'CNN', URL = 'http://cnn.com/')", "sones.gql");
            CheckResult(cnnResult);

            var xkcdResult = GraphDS_API.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'xkcd', URL = 'http://xkcd.com/')", "sones.gql");
            CheckResult(xkcdResult);

            var onionResult = GraphDS_API.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'onion', URL = 'http://theonion.com/')", "sones.gql");
            CheckResult(onionResult);

            //adding an unknown property ("Unknown") means the property isn't defined before
            var unknown = GraphDS_API.Query(SecToken, TransToken, "INSERT INTO Website VALUES (Name = 'Test', URL = '', Unknown = 'unknown property')", "sones.gql");
            CheckResult(onionResult);

            #endregion

            #region create instances of type "Tag"

            var goodResult = GraphDS_API.Query(SecToken, TransToken, "INSERT INTO Tag VALUES (Name = 'good', TaggedWebsites = SETOF(Name = 'CNN', Name = 'xkcd'))", "sones.gql");
            CheckResult(goodResult);

            var funnyResult = GraphDS_API.Query(SecToken, TransToken, "INSERT INTO Tag VALUES (Name = 'funny', TaggedWebsites = SETOF(Name = 'xkcd', Name = 'onion'))", "sones.gql");
            CheckResult(funnyResult);

            #endregion
        }

        #endregion

        #region How to: Gather Data with TypeServices and InstanceServices

        private void GatherData()
        {
            #region Get VertexType from DB by Name

            // find out which tags xkcd is tagged with
            var _xkcdtags = GraphDS_API.Query(SecToken, TransToken, "FROM Website w SELECT w.Tags WHERE w.Name = 'xkcd' DEPTH 1", "sones.gql");

            CheckResult(_xkcdtags);

            foreach (var _tag in _xkcdtags.Vertices)
                foreach (var _hyperEdge in _tag.HyperEdges)
                    if (_hyperEdge.Item1 == "Tags")
                        foreach (var _edge in _hyperEdge.Item2.Edges)
                            foreach(var _property in _edge.TargetVertex.Properties)
                                if(_property.Item1 == "Name")
                                    Console.WriteLine(_property.Item2.ToString());

            // List tagged sites names and the count of there tags
            var _taggedsites = GraphDS_API.Query(SecToken, TransToken, "FROM Website w SELECT w.Name, w.Tags.Count() AS Counter", "sones.gql");

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
            var _urls = GraphDS_API.Query(SecToken, TransToken, "FROM Tag t SELECT t.Name, t.TaggedWebsites.URL", "sones.gql");

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

        static void Main(string[] args)
        {
            RemoteTagExampleWithGQL example = new RemoteTagExampleWithGQL();
            example.run();
        }
    }
}
