package com.metacube.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Main;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class EmployeePortalSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePortalSpringBootApplication.class, args);
	}

	  @RequestMapping("/")
	  String index() {
	    return "index";
	  }
}
