# AWS Image Upload

Full stack app that allows you to upload a user and an image for that user
on the front end and saves this in an S3 bucket on your AWS account.

## To Run:

Add the AWS ACCESSKEY and SECRETACCESSKEY on the terminal by:
```$ export ACCESSKEY=xxxxxxxxxxxxxx```</br>       
```$ export SECRETACCESSKEY=xxxxxxxxxxxxxxxxxxxx```</br>
or if using IntelliJ hit ```edit configurations```, ```environment``` and ```add environment variables```

Run ```$ make mvn-build``` and ```$ make mvn-run``` or on IntelliJ, run main file ```/Users/jadealvares/Documents/Practise/aws-image-upload/src/main/java/com/jade/awsimageupload/AwsImageUploadApplication.java```</br>
On another terminal, navigate to ```src/main/frontnend```: ```$ npm start```</br>
