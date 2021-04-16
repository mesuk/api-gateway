FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} api-gateway.jar

ENTRYPOINT ["java","-jar","/api-gateway.jar"]