# create-boot-dockerfile

creating a spring-boot docker image

A SpringBoot application Image bases on an OpenJDK image because Java has been deprecated. 

The name, _Dockerfile_, is a unique name for a docker file, and it starts with a capital D, and the rest are small. 

It may need to simplify a jar file name within a Maven build section 

````
<build>
		<finalName>welcome-docker</finalName>
</build>
````

SpringBoot web application by default exposes itself to the port 8080 of the container and overriding the EXPOSE in the docker file. This may cause the port not correctly mapped, and cannot be accessed from the client-side.

It may need to explicitly define sever port within the application.properties.  

````
Within application.properties, we may explicitly define SpringBoot exposure port. 
server.port=8085

And remapping to the host port.
docker run -p 8085:8085 spring-boot-welcome-web
````

**Build docker image**

The docker build command builds Docker images from a Dockerfile and a “context”. A build’s context is the set of files located in the specified PATH or URL. 

````
docker build [OPTIONS] PATH | URL | -

docker build -f PATH/Dockerfile -t name:tag

[OPTIONS]
-f: Name of the Dockerfile (Default is 'PATH/Dockerfile')
-t: Name and optionally a tag in the 'name:tag' format

docker build -t spring-boot-welcome-web:latest .

. stands for the current path
````

**Run customer image**
````
docker run -p 8085:8085 spring-boot-welcome-web
````

**Enter inside container**

````
docker exec -it container-name/container-id bash

run command env 
````

![image](https://user-images.githubusercontent.com/17804600/125706054-5ac8cbae-88d0-4bba-ad39-abfce33ecc51.png)

The target jar file was ADDed inside container root directory. 


