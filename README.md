# Redhat-assignment
## Step1: open gitbash
![title](open_gitbash_1.PNG)
## Step2: create a clone directory
```
mkdir projects/
```
## Step3: goto the clone directory
```
cd projects/
```
## Step4: clone the project
```
git clone https://github.com/vsitzmann/scene-representation-networks.git
```
## Step5: goto project firectory
```
cd Redhat-assignment/
```
## Step6: compile the project
```
mvn clean install
```
## Step7: run the project
```
mvn spring-boot:run
```
## Step8: Open browser and search below
```
http://localhost:8080
```
if Hello message appears, that means project is running fine
## Step8: Open Swagger or any Rest API client like Postman
For swagger : http://localhost:8080/swagger-ui.html then click on rest-controller
From Docker: http://192.168.99.100:9090/swagger-ui.html
```
For Postman : "http://localhost:8080/uploadFile" with POST and uploading logfile
```
![title](swagger.PNG)
## Step9: Click on Post, then click on tryout, then choose a file where log is given
![title](logfile.PNG)
## Step10: Click on Execute
You will get a response with response code 200 and response body with Json file
![title](get_response.PNG)

## Step11: Find the docker image
Docker Image : https://hub.docker.com/u/amitnits2016
Docker Port 9090 with IP: http://192.168.99.100:9090/swagger-ui.html
