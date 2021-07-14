# create-boot-dockerfile

creating a spring-boot docker image

A Springboot application Image is based on an OpenJDK image because Java has been deprecated. 

The name, _Dockerfile_ is the unique name for a docker file, and the initial D must be a capital, and the rest must be small. Dockerfile may variate and differentiate each by its extension names.   

Simplify a jar file name from a Maven build

````
<build>
		<finalName>welcome-docker</finalName>
</build>
````

Springboot web application by default exposes itself to the port 8080 of the container and overriding the EXPOSE action in the docker file. This may cause the port not correctly mapped, and cannot be accessed from the client-side.  

````
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
