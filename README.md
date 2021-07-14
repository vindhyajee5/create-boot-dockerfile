# create-boot-dockerfile

creating a spring-boot docker image

A SpringBoot application Image bases on an OpenJDK image because Java has been deprecated. 

The name, _Dockerfile_, is a unique name for a docker file, and it starts with a capital D, and the rest are small. Dockerfile name may differentiate each other by its extension names.   

It may need to simplify a jar file name within a Maven build section 

````
<build>
		<finalName>welcome-docker</finalName>
</build>
````

SpringBoot web application by default exposes itself to the port 8080 of the container and overriding the EXPOSE action in the docker file. This may cause the port not correctly mapped, and cannot be accessed from the client-side.

It may need to explicitly define sever port within the application.properties.  

````
Within application.properties, we may explicitly define SpringBoot exposure port. 
server.port=8085

And remapping to the host port.
docker run -p 8085:8085 spring-boot-welcome-web
````

**build docker image**

````
docker build -f Dockerfile -t tag image-name
-f: Specify a Dockerfile (-f)
-t: tag the image
image-name: the name for the image
````

**Run customer image**
````
docker run -p 8085:8085 spring-boot-welcome-web
````
