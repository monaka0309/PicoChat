# FROM openjdk:17-jdk-slim
# RUN apt-get update && apt-get install -y \
#     curl \
#     maven \
#     && apt-get clean && rm -rf /var/lib/apt/lists/*
# WORKDIR /app
# COPY . .
# RUN mvn clean package -DskipTests
# ENTRYPOINT ["java", "-jar", "target/pico-chat.jar"]

FROM maven:3.8-openjdk-17 AS builder
WORKDIR /PicoChat
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk
WORKDIR /app
COPY --from=builder /PicoChat/target/pico-chat.jar ./pico-chat.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/pico-chat.jar"]