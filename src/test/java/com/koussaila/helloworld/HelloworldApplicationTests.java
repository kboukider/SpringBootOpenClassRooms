package com.koussaila.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.koussaila.helloworld.model.HelloWorld;
import com.koussaila.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {
	
	@Autowired
	BusinessService bs;
	
	@Test
	void contextLoads() {
	}

	@Test
	void testgetHelloWorld() {
		String expect = "Hello World !";
		String resultat = bs.getHelloWorld().getValue();
		
		assertEquals(expect, resultat);
		
	}
}
