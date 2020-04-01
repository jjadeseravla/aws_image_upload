package com.jade.awsimageupload.config;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean //create a bean of type amazon s3
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                System.getenv("ACCESSKEY"),
                System.getenv("SECRETACCESSKEY")
        );
                return AmazonS3ClientBuilder
                        .standard()
                        .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                        .withRegion("eu-west-1")
                        .build();
    }

}
