FROM openjdk:8
EXPOSE 8080
ADD target/redhat-assignment.jar redhat-assignment.jar
ENTRYPOINT ["java", "-jar", "/redhat-assignment.jar"]