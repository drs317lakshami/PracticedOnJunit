package com.blz.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTesting {

	@Test
	public void testTwoPositiveNumber_thenHappy() {
		Calculator calci = new Calculator();
		assertEquals(30, calci.add(10,20));
		
	}

	@Test
	public void testOnePositiveAndOneNigativeNumber_thenHappy() {
		Calculator calci = new Calculator();
		assertEquals(10, calci.add(20,-10));
}
	
	@Test
	public void OnePositveOneZero_thenHappy() {
		Calculator calci = new Calculator();
		assertEquals(20, calci.add(20,0));
}
	
	@Test
	public void OneNegativeOneZero_thenHappy() {
		Calculator calci = new Calculator();
		assertEquals(-20, calci.add(-20,0));
}
	
	@Test
	public void TwoNegativeNumber_thenHappy() {
		Calculator calci = new Calculator();
		assertEquals(-30, calci.add(-20,-10));
}
	}


	
