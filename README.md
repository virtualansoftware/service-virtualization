[![Build Status](https://travis-ci.com/virtualansoftware/virtualan-wsdl-demo.svg?branch=master)](https://travis-ci.com/virtualansoftware/virtualan-wsdl-demo)


<h1 align="center" > Virtualan </h1>

[![Maven Central](https://img.shields.io/maven-central/v/io.virtualan/virtualization.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.virtualan%22%20AND%20a:%22virtualization%22)  [![Build Status](https://travis-ci.com/virtualansoftware/service-virtualization.svg?branch=master)](https://travis-ci.com/virtualansoftware/service-virtualization-openapi)

> Virtualan is an open source-based Open API Interface driven, Kafka, AMQ and MQTT Service virtualization product. It supports #OpenAPI, #AsyncAPI test development. This supports #shiftleft testing.

**Product page:** https://www.linkedin.com/products/virtualan-software-virtualan/

**Tutorials:**  https://tutorials.virtualan.io/#/Virtualan

**Example:**  https://github.com/virtualansoftware/service-virtualization-openapi

**Video:**  https://www.youtube.com/watch?v=otTjbPxT0W8 

**Docker Image:**  https://hub.docker.com/r/virtualan/service-virtualization  


*I. Initial Set up your project for the WSDL Specification* :

- Why/How to store the mock data in the centralized place:
	It always provides a choice to choose your data base and configure(spring-jpa). Need to provide data base information in the Application.properties in the "src/main/resources" directory of your spring boot application: This would requires if you don't want to loose the existing mock data because as you redeploy the code the data would be lost.

- In memory DB: (Eveny restart you lose the old data)
	
	- virtualan.datasource.driver-class-name=org.hsqldb.jdbcDriver
	- virtualan.datasource.jdbcurl=jdbc:hsqldb:mem:dataSource
	- virtualan.datasource.username=sa
	- virtualan.datasource.password=
     
- Add the following entry for each Interface Spec/wsdl  to be set up as mock service:
	- to setup  "apex.wsdl" need to add following entry in the pom.xml. refer the pom.xml for reference
	
	```html
	<plugin>
        <groupId>org.apache.cxf</groupId>
        <artifactId>cxf-codegen-plugin</artifactId>
        <version>3.3.7</version>
        <executions>
          <execution>
            <id>virtualan-generate-sources</id>
            <phase>generate-sources</phase>
            <configuration>
              <sourceRoot>${basedir}/src/main/java</sourceRoot>
              <wsdlOptions>
                <wsdlOption>
                  <wsdl>${basedir}/src/main/resources/META-INF/resources/wsdl/Hello/helloworld.wsdl</wsdl>
                  <extraargs>
                    <extraarg>-xjc-Xequals</extraarg>
                    <extraarg>-xjc-XhashCode</extraarg>
                    <extraarg>-xjc-XtoString</extraarg>
                  </extraargs>
                  <bindingFiles>
                    <bindingFile>${project.basedir}/src/main/resources/xjb/bindings.xjb</bindingFile>
                  </bindingFiles>
                 </wsdlOption>
              </wsdlOptions>
            </configuration>
            <goals>
              <goal>wsdl2java</goal>
            </goals>
          </execution>
        </executions>
        <dependencies>
          <dependency>
            <groupId>org.jvnet.jaxb2_commons</groupId>
            <artifactId>jaxb2-basics</artifactId>
            <version>0.6.5</version>
          </dependency>
        </dependencies>
      </plugin>
      
	```

*II. Navigate to root directory of the folder where pom.xml was present*:

- Build:
         - mvn clean install  
	 
	 - If you have any proxy issue use this command:  mvn -Dhttps.protocols=TLSv1,TLSv1.1,TLSv1.2 clean install 
                  
- Run using standalone JAR:
	
	- java -jar target/virtualan-wsdl-demo.jar         

- To set up  data:
      
      - Using Virtualan-UI:       
      	https://github.com/virtualansoftware/virtualan/wiki/Test-Data-Set-up-using-Virtualan
      
      - open API Contract: 
        https://github.com/virtualansoftware/virtualan/blob/master/modules/virtualan-plugin/src/main/resources/virtualservices.yaml
	
    
      - Using Virtualan-Rest service: for automation usecases
        https://github.com/virtualansoftware/virtualan-openapi-demo/blob/master/src/test/resources/features/demo/demo.feature
	
	
- Invoke Virtualan UI:  			
	- Navigate to http://localhost:8080/virtualan-ui.html 
	- More details about the user interface refer: https://github.com/virtualansoftware/virtualan/wiki 
