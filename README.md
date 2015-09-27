# MDLParser
This is a simple lib I wrote to parse and manipulate MDL files. MDL is a file format to store 3D models files, usually used by Warcraft 3. However, standard Warcraft 3 models come in MDX format, a binarized version of MDL. In order to do the conversion, you can use the following tool: http://www.hiveworkshop.com/forums/tools-560/mdlx-converter-62991/

## Including the lib in your project
You can use the generated JAR which can be found on the "lib" folder inside this project. Just import it like any other JAR file. 

## Using the lib
The single most important class is "MDLModel", which can be found on "io.github.picoledelimao.mdl" package. It contains a static method called "parseFromFile", which expects a path to the file which will be parsed and returns a new MDLModel instance. After then, you can access and manipulate the 3D model elements, such as textures, geosets and animations, through the "get" methods. After modifying the elements, you can save it to another file calling the method "writeToFile", which also expects a path.