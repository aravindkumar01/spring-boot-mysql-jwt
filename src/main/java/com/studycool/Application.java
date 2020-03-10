package com.studycool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


/*
 * 
 * 
 * 
 * 
 * 
 * localhost:8091/signup  POST method
 * {
	"first_name":"aravind",
	"last_name":"kumar",
	"mobile":"9786950251",
	"role":"user",
	"username":"aravind@gmail.com"
	
	
}

localhost:8091/token/generate-token

{
	"username":"aravind@gmail.com",
	"password":"kumar0251"
}


localhost:8091/users


key:Authorization
value:Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmF2aW5kQGdtYWlsLmNvbSIsInNjb3BlcyI6IlJPTEVfQURNSU4iLCJpYXQiOjE1ODM4NDk1NzMsImV4cCI6MTU4Mzg2NzU3M30.A-akrFajDFAnFE8bLHSy14ZlmENrZUxZM8jOStDD2w4
*/
 */