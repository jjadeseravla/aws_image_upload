package com.jade.awsimageupload.config;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                System.getenv("AWS_ACCESS_KEY"),
                System.getenv("AWS_SECRET_ACCESS_KEY")
        );
                return AmazonS3ClientBuilder
                        .standard()
                        .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                        .build();
    }

}
