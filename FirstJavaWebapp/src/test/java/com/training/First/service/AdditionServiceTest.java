package com.training.First.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionServiceTest {

	@Test
	public void testAdd() {
		AdditionService additionService = new AdditionService();
		int expected = 10;
		int actual = additionService.add(5, 5);
		assertEquals("Addition wrong", expected, actual);
		
	}
	
	@Test
	public void tesSub() {
		AdditionService additionService = new AdditionService();
		int expected = 00;
		int actual = additionService.sub(5, 5);
		assertEquals("subtraction wrong", expected, actual);
		
	}

}
