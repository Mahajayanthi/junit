package com.example.Junitsample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitsampleApplicationTests {

	JunitsampleApplication a=new JunitsampleApplication();

	@Test
	public void add() {
		assertEquals(28,a.add());
	}
	public void mul() {
		assertEquals(6,a.mul());
	}

}
