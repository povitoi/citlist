FROM openjdk:17-alpine

WORKDIR /app

COPY target/citlist.jar /app/citlist.jar

ENTRYPOINT ["java", "-jar", "/app/citlist.jar"]