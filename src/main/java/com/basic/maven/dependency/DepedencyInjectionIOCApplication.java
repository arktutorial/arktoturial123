package com.basic.maven.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.maven.ioc.test.Car;

@SpringBootApplication
public class DepedencyInjectionIOCApplication {
	public static void main(String[] args) {

ConfigurableApplicationContext context = SpringApplication.run(DepedencyInjectionIOCApplication.class, args);
	Car car =  context.getBean(Car.class);
	System.out.println(car.getEngine());
	}
}
