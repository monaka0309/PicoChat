FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/pico-chat.jar
COPY ${JAR_FILE} pico-chat.jar
ENTRYPOINT ["java","-jar","/pico-chat.jar"]
