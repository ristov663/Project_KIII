<<<<<<< HEAD
FROM eclipse-temurin:18-jdk AS builder
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
FROM eclipse-temurin:18-jdk
WORKDIR /app
COPY --from=builder /app/target/app-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar"]
=======
FROM eclipse-temurin:18-jdk AS builder
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
FROM eclipse-temurin:18-jdk
WORKDIR /app
COPY --from=builder /app/target/app-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar"]
>>>>>>> 764dcc4f756eafcb0b94fcb5d59b7922b138666d
