package com.blz.junit;
import static org.junit.Assert.*;

import org.junit.Test;

public class SubtractionTesting {
	@Test
	public void testTwoPositiveNumber_thenHappy() {
		Calculator calci = new Calculator();
		assertEquals(-10, calci.sub(10,20));
		
	}

}
