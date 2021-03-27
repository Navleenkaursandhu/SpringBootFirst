package io.learning.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.io.project.domain.Car;

@ComponentScan(basePackages = "spring.io.project.domain")
@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
		System.out.println(context.getBean("car", Car.class));

	}

}
