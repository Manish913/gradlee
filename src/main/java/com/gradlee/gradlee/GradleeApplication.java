package com.gradlee.gradlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class GradleeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleeApplication.class, args);

}
	@RequestMapping(value = "/hello")

	public String hello(){
		return "hello manish je bihar";
	}

	@RequestMapping(value = "/msg")

	public String getMsg(){
		return "hello to java ";
	}
}

