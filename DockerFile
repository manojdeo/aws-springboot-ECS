FROM openjdk:8
ADD target/aws-springboot-ECS-0.0.1-SNAPSHOT.jar aws-springboot-ECS-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "aws-springboot-ECS-0.0.1-SNAPSHOT.jar"]