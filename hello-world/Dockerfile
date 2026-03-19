FROM eclipse-temurin:25.0.2_10-jre-noble

WORKDIR /app

COPY target/hello-world-server-*.jar .

EXPOSE 8080

CMD ["sh", "-c", "java -jar hello-world-server-*.jar"]
