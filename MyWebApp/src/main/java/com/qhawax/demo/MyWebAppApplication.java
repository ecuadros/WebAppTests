package com.qhawax.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyWebAppApplication {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		ConfigurableApplicationContext context = SpringApplication.run(MyWebAppApplication.class, args);
		
		
	}

}
