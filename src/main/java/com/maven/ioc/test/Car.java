package com.maven.ioc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine engine;

	public String getEngine() {
		return engine.name;
	}

}
