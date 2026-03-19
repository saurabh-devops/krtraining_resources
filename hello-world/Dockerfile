FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/hello-world-server-*.jar .

EXPOSE 8080

CMD ["sh", "-c", "java -jar hello-world-server-*.jar"]
