How to generate the client stub with wsimport:

- an installed instance of glassfish is required
- import script can be found in the glassfish directory
- it is recommanded to use to following parameter for wsimport.bat
	-keep
	-b <path-to-remote-tag-example>\src\binding.xml -> path to jaxb binding config file
	-d <path-to-remote-tag-example>\src -> output dir
	http://127.0.0.1:9970/rpc?wsdl -> uri of required wsdl

For further information, see Oracle Documentation:
http://download.oracle.com/javase/6/docs/technotes/tools/share/wsimport.html