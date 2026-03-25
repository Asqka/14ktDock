FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY app.jar /app/app.jar
COPY config.properties /app/config.properties
CMD ["java", "-jar", "app.jar"]
