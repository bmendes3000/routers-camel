## Camel Routes Integration 

This sample project has the objective of show the integration between the technologies:
	- apache-camel
	- spring 
	- jooq
Also created simple routes, as:
	- Direct
	- Timer
	- File
	- Rest

## Motivation
This project have objective, remove doubts about integration jooq, spring and camel, also show the patterns and form of implementations of routes.

## Instalation
 # For generate build of the WAR:
	mvn clean install

 # Run in web container Jetty:	
	mvn jetty:run

 # Develop and run in eclipse with tomcat:
	mvn clean install eclipse:eclipse -Dwtpversion=2.0

Any doubts, please, call me.

## Lincense
Permission is hereby granted, free of charge, to any person obtaining a copy of this project and associated documentation files (the "Project"), to deal in the Project without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE PROJECT IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE PROJECT OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.