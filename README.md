# Spring-REST-API
1. Deployed a Spring REST application using docker and mongo database.
2. The API peforms CRUD operations on an "Employee" database displaying information such as Employee ID, Employee name, and Employee Designation.
3. The API testing is done using swagger.
4. To run the application using docker, follow the steps:
   - Install docker
   - Run the command, to get the mongo image: 
   ````docker
   docker pull mongo
   ````
   The command pulls the latest mongo image to docker.
   - We can check the docker images using using 
   ````docker
   docker images
   ````
   - For our API, we create two mongo containers and connect them internally to function as a simple REST application. One docker container can be easily opened from the docker image we pulled. 
   ````docker 
   docker run -d -p 27017:27017 --name spring-boot mongo:latest
   ````
   For the other container, we can build it using the dockerfile created in the application. The default mongo ports : 27017:27017
   ````docker
   docker build -t spring-mongo:1.0 .
   ````
   Before setting up any container we can check whether its originally deployed o not using
   ````docker
   docker ps -a
   ````
   This will show all the active containers.
   - Now, we have our containers up and can be connected to run the application as:
   ````docker
   docker run -p 8080:8080 --name spring-mongo --link spring-boot:mongo -d spring-mongo:1.0
   ````
   - We can check secure connection of our application using:
   ````docker
   docker logs spring-mongo
   ````
   - We have our containers and application and can be checked in mongo by opening the mongo bash shell :
   ````docker
   docker exec -it spring-boot bash
   ````
5. We have seen how to run our spring application using docker containers and mongodb as our database.
