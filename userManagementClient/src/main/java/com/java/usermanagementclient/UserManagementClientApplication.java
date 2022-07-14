package com.java.usermanagementclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class UserManagementClientApplication {

    static RestTemplate restTemplate = new RestTemplate();
    static String baseUrl = "http://localhost:8083/springDataJpa/";

    public static void main(String[] args) {

//        SpringApplication.run(UserManagementClientApplication.class, args);

//        ForEntityMethodOfRestTemplateDemo forEntityMethodOfRestTemplateDemo = new ForEntityMethodOfRestTemplateDemo();
//        forEntityMethodOfRestTemplateDemo.driverMethod();

        ForObjectMethodOfRestTemplateDemo forObjectMethodOfRestTemplateDemo = new ForObjectMethodOfRestTemplateDemo();
        forObjectMethodOfRestTemplateDemo.driverMethod();
    }
}