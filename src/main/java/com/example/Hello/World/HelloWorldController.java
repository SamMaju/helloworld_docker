package com.example.Hello.World;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/{name}")
	public String HelloWorld(@PathVariable(value = "name") String name){
		return "Hello " +name+ " Welcome to the world of Java";
	}
	
	@GetMapping("/")
	public String defaultMapp(){
		return "Hello V3";
	}
}