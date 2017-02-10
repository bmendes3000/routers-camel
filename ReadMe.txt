Camel Router WAR Project
========================

This project includes a sample route as as a WAR.
You can build the WAR by running

mvn install

You can then run the project by dropping the WAR into your 
favorite web container or just run

mvn jetty:run

to start up and deploy to Jetty.

for run in tomcat, execute the commands

mvn clean install eclipse:eclipse -Dwtpversion=2.0

after run command, so, add in server tomcat

For more help see the Apache Camel documentation

    http://camel.apache.org/