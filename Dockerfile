FROM openjdk:11
ADD target/welcome-docker.jar welcome-docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","welcome-docker.jar"]