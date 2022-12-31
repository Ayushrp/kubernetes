FROM openjdk:8
EXPOSE 8080
ADD luckymegha/kubernetes.jar kubernetes.jar
ENTRYPOINT ["java","-jar","/kubernetes.jar"]
