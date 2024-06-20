# Stage 1: Build the application
FROM maven:3.8.1-openjdk-11 AS build
WORKDIR /home/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/hello-world-1.0-SNAPSHOT.jar /usr/local/lib/hello-world.jar
ENTRYPOINT ["java", "-jar", "/usr/local/lib/hello-world.jar"]

# Stage 3: Test the application
FROM maven:3.8.1-openjdk-11 AS test
WORKDIR /home/app
COPY pom.xml .
COPY src ./src
RUN mvn test
