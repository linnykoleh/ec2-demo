FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar /app/myapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
