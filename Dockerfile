FROM ubuntu:latest AS build
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven

COPY . .
RUN ./mvnw clean package -DskipTests

# Etapa de Execução
FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from=build /target/vsa-api-voos-1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
