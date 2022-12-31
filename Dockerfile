FROM openjdk:8
EXPOSE 8080
ADD target/*.jar kubernetes.jar
ENTRYPOINT ["java","-jar","/*.jar"]
