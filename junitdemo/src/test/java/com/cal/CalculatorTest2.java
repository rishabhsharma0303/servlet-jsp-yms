package com.cal;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {

	private Calculator calculator;

	@Before
	public void beforeTest() {
		calculator=new Calculator();
	}

	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
	}

	@Test
	public void multiplyTest() {
		assertEquals(12, calculator.mulitply(3, 4));
	}

	@Test
	public void divideTestWithSuccess() {
		assertEquals(2, calculator.divide(12,5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideTestWithException() {
		assertEquals(2, calculator.divide(12,0));
	}
	
	@After
	public void afterTest() {
		calculator=null;
	}
}
