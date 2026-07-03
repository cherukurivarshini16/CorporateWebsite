# Use Java 21 base image
FROM eclipse-temurin:25-jdk

# Create working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Expose Spring Boot port
EXPOSE 8081

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]