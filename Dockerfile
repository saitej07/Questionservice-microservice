# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17
EXPOSE :8080
ADD target/*.jar question-microservice.jar
ENTRYPOINT ["java","-jar","question-microservice.jar"]
