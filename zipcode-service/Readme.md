# Zipcode Service #

## What is this? ##

This is a simple micro service.  It exposes a state lookup by zipcode lookup micro service.

## Wait, is this container less service? ##

Yes, you may have heard of Tomcat, Jetty, or Docker.  These container are great, but you don't
need containers to run micro service.  This service doesn't use any other this.
This was done to focus on the RESTful method we want to expose.  There's not need for additional
overhead of a container.

## Why is container less important? ##

Services like this one are very easy to run in the Cloud.  E.g. you can easily create a jar 
load it to an EC2 instance a start it.  It will start serving traffic for requests you throw at
it.  It's easy to migrate this it host less deployments, but no need to dig into this one
right now.

## What's the technology stack? ##

In addition to the core java library, the project is uses Grizzly, Jersey, Maven (as the build
system).

## What's up with the package name? ##

Yes, ms.lucina.conless is pretty odd when you first see it.  Ms is for mirco service, 
Lucina (the Roman goddess of child birth) is the umbrella project name, and conless 
is short of the container less.

## Why is everything in one package? ##

The service should be clean and responsible for one thing.  If we add a bunch stuff to this project
and say, woah, that's way to many files in this package, that should be an alarm.  This service
has become to complex.  Break it up!

## Wait, you're storing the zipcode lookup table as a property file? ##

Yes, property files are apart of the core Java language.  Also, it's really a glorified hashtable
(more or less).  It's super simple to use key value lookup.

## How was the project created? ##

The project was created from the jersey quickstart-grizzly2 archetype.

mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 -DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false  -DgroupId=com.eliotpearson -DartifactId=zipcode-service -Dpackage=com.eliotpearson.conless -DarchetypeVersion=2.17

## How to I change the where the service listens to? ##

On line 18 of Main.java, the BASE_URI variable is hard coded.  Change this to whatever you
need it to be.

## How do a run this? ##

mvn exec:java

## How do I see the wadl? ##

Curl or paste the following url into your browser of choice:

http://localhost:8080/application.wadl

## How do I use the service ##

The state service is simple to use.  To lookup the state for a zipcode either curl or
paste the following url into your browser:

http://localhost:8080/state?zipcode=410
