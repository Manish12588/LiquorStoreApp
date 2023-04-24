FROM tomcat:latest
RUN apt-get update && apt-get install maven -y
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:resolve
COPY . /app
CMD ["mvn", "tomcat7:run"]
