# Redhat-assignment
## Step1: open gitbash
## Step2: goto your clone directory
## Step3: create a directory inside your clone directory
```
mkdir Redhat-assignment/
```
## Step4: clone the project
```
git clone --recurse-submodules https://github.com/vsitzmann/scene-representation-networks.git
```
## Step5: goto project firectory
```
cd Redhat-assignment/
```
## Step5: compile the project
```
mvn clean install
```
## Step6: run the project
```
mvn spring-boot:run
```
## Step7: Open browser and search below
```
http://localhost:8080
```
if Hello message appears, that means project is running fine
## Step8: Open Swagger or any Rest API client like Postman
```
http://localhost:8080/swagger-ui.html
```
![title](swagger.png)
## Step8: Click on Post, then click on tryout, then choose a file where log is given
![title](logfile.png)
## Step9: Click on Execute
You will get a response with response code 200 and response body with Json file
![title](response.png)
