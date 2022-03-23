package com.example.Junitsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoclassTest {
	Democlass a=new Democlass();

	@Test
	public void add() {
		int result = a.add();
		assertEquals(result,5);
		}
	@Test
	public void mul() {
		int result = a.mul();
		assertEquals(result,72);
		}
	

}
