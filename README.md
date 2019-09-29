# springboot
Spring Boot Projects

Spring Boot can auto-configure embedded H2, HSQL, and Derby databases. You need not to provide any connection URLs. You need only include a build dependency on the embedded database that you want to use.

# Some advantages of in-memory databases
Zero-project setup or infrastructure
Zero Configuration
Zero Maintainance
Easy to use for Learning, POCs and Unit Tests
# What is the H2 Database?
 H2 is an open source database and is written in Java. It is very fast and of very small size. It is primarily used as an in-memory database which means it stores the data in memory and will not persist data on disk. Although if we need to persist the data, it supports that as well.
 
 <dependencies>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
    </dependency>
</dependencies>

# Using H2’s Web Console
The H2 database provides a browser-based console that Spring Boot can auto-configure for you. The console is auto-configured when the following conditions are met:
* You are developing a servlet-based web application.
* com.h2database:h2 is on the classpath.
* You are using Spring Boot’s developer tools.
# Note: 
If you are not using Spring Boot’s developer tools but would still like to make use of H2’s console, you can configure the spring.h2.console.enabled property with a value of true.
# Note: 
The H2 console is only intended for use during development, so you should take care to ensure that spring.h2.console.enabled is not set to true in production.

# Changing the H2 Console’s Path
By default, the console is available at /h2-console. You can customize the console’s path by using the spring.h2.console.path property.

# What is HSQLDB?
HSQLDB (HyperSQL DataBase) is the leading SQL relational database software written in Java. It offers a small, fast multithreaded and transactional database engine with in-memory and disk-based tables and supports embedded and server modes. It includes a powerful command line SQL tool and simple GUI query tools.

<dependency>
    <groupId>org.hsqldb</groupId>
    <artifactId>hsqldb</artifactId>
    <scope>runtime</scope>
</dependency>

# What is Apache Derby?
Derby is based on the Java, JDBC, and SQL standards.
Derby provides an embedded JDBC driver that lets you embed Derby in any Java-based solution.

<dependency>
    <groupId>org.apache.derby</groupId>
    <artifactId>derby</artifactId>
    <scope>runtime</scope>
</dependency>
