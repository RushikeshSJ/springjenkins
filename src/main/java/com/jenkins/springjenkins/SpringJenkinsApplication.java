package com.jenkins.springjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

    public static void main(String[] args) {
        System.out.println("Project Started");
        System.out.println("Hello");
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
