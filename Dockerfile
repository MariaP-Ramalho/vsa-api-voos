FROM ubuntu:latest AS build
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven

COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

RUN ls target

FROM openjdk:17-jdk-slim
EXPOSE 10000
COPY --from=build /target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
