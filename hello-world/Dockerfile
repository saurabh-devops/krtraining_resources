FROM openjdk:17-slim

WORKDIR /app

COPY target/hello-world-server-*.jar .

EXPOSE 8080

CMD ["sh", "-c", "java -jar hello-world-server-*.jar"]
