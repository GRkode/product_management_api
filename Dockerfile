FROM eclipse-temurin:17-jdk-alpine-3.21

LABEL authors="GRkode"

WORKDIR /app
COPY target/bootcamp.jar ./bootcamp.jar

EXPOSE 8080

CMD [ "java", "-jar", "bootcamp.jar" ]