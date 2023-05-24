FROM bitnami/tomcat:latest
COPY target/spring-review-0.0.1-SNAPSHOT.war /opt/bitnami/tomcat/webapps
COPY target/spring-review-0.0.1-SNAPSHOT.war.original /opt/bitnami/tomcat/webapps
EXPOSE 8080
CMD ["catalina.sh", "run"]