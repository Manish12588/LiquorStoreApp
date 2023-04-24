FROM tomcat:7.0-jdk8-openjdk-slim
RUN apt-get update && apt-get install -y maven
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:resolve
COPY . /app
CMD ["mvn", "tomcat7:run"]
