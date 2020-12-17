package com.example.hibernateconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.hibernateconfig.repository.TestRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		TestRepository bean = applicationContext.getBean(TestRepository.class);
		bean.createTable();
	}

}
