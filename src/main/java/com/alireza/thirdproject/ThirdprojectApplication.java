package com.alireza.thirdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ThirdprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdprojectApplication.class, args);
	}
	@RequestMapping("/")
    public String index(@RequestParam(value="name" ,defaultValue="Human")String searchQuery ,@RequestParam(value="lastname" ,defaultValue="") String searchQuery2) {	
			return "<div><h1>Hello " + searchQuery +" " +searchQuery2 + " </h1><p>Welcome to springboot!</p></div>";	
	}  
}
