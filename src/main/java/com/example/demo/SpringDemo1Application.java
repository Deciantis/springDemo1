package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EntityScan(basePackages = {"com.example.demo"})
public class SpringDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1Application.class, args);
	}

    @RequestMapping("/")
    String home(){
        return  "Hello World!";
    }

}
