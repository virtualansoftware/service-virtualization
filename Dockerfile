FROM adoptopenjdk/openjdk11

ADD target/virtualan-sv-wsdl-demo.jar /openapi/virtualan/virtualan-sv-wsdl-demo.jar

ENTRYPOINT ["java", "-jar", "/openapi/virtualan/virtualan-sv-wsdl-demo.jar"]
