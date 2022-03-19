package com.example.Hello.World;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Testing application");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
