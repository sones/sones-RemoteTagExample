sones Remote API Examples 							2011-09-15 by sones GmbH
-------------------------

The RemoteTagExample is an adaption of the TagExample from the sones-CommunityEdition Solution. It
shows the usage of the API from the GraphDB - respectively the remote API introduces in version 2.1.
There is no further documentation to this examples, just take a glace at the code and follow the comments.
There are Wrapper for this remote API available (see: https://github.com/sones/sones-GraphMappingFramework).

The GraphMappingFramework lies on top of the remote API. 

-------------------------


!!!Important!!!
These examples comes with full generated 'Client Stubs' (including network settings). It could be, that this code is not
up-to-date related to the current GraphDB. You are able to generate you client stub by your own.
A WSDL (Web Service Description Language; see: http://www.w3.org/TR/wsdl) will be exported by the GraphDB.

-------------------------

Network Settings are: 'localhost:9970/rpc' - this are the default settings for the sones.RemoteAPI Service containing in the GraphDB v2.1



This repository contains RemoteTagExample in the following programming languages:

	-> C# (.NET 4.0)
		History:	initial release 2011-09-15
				Features:	- Create VertexTypes (Website, Tag) with TypePredefinitions
						- Insert Data (Values, Edges)
						- Gather data by several ways (including by ids, Expressions, ...)

	-> Java (JDK 7EE)
		History:	initial release 2011-09-15
				Features:	- Create VertexTypes (Website, Tag) with TypePredefinitions
						- Insert Data (Values, Edges)
						- Gather data by several ways (including by ids, Expressions, ...)
