FROM maven:3.8.1-openjdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/hello-world-1.0-SNAPSHOT.jar /usr/local/lib/hello-world.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/hello-world.jar"]
