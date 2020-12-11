package com.koussaila.helloworld.service;

import org.springframework.stereotype.Component;

import com.koussaila.helloworld.model.HelloWorld;

@Component
public class BusinessService {
	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw ;
	} 

}
