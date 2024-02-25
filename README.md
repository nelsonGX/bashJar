# bashJar
open bash in a jar file.
# how to use
go to [release](https://github.com/nelsonGX/bashJar/releases) download `Openbash.jar`.  
run it on your machine/docker container:  
```java -jar OpenBash.jar```
# compile from source
1. make sure a correct JDK version is installed (17 is used in the release file): https://www.oracle.com/java/technologies/downloads/
2. compile and warp
```bash
javac OpenBash.java
jar cvfm OpenBash.jar manifest.txt OpenBash.class
```
3. done
