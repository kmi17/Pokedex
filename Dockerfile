FROM openjdk:11-jre-slim-buster
VOLUME /pokedex-service
ARG JAR_FILE=target/Pokedex-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} pokedex.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/pokedex.jar"]