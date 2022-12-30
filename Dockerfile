FROM openjdk:8
COPY *.jar /app.jar
CMD ["--server.port=8080"]
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "/app.jar"]
