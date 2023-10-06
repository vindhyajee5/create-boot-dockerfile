FROM openjdk:17
ADD target/welcome-docker.jar welcome-docker.jar
ENTRYPOINT ["java","-jar","welcome-docker.jar"]
