package com.springbootdev.springcloud.examples.departmentservice;

import com.ulisesbocchio.jasyptspringboot.environment.StandardEncryptableEnvironment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.environment(new StandardEncryptableEnvironment())
				.sources(EmployeeServiceApplication.class).run(args);
		//SpringApplication.run(EmployeeServiceApplication.class, args);
	}
}
