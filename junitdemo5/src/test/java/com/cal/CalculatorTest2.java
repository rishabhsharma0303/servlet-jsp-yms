package com.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest2 {

	private Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}
	
	//how to handle exceptions in Test Case
	@Test
	public void divideWithArithExTest() {
		assertThrows(ArithmeticException.class, 
				()-> calculator.divide(10, 0), 
				()-> "divide by zero");
	}
	
	//test mutiple method in junit5
	@Test
	public void addMultipleMethods() {
		assertAll(
				()-> assertEquals(4, calculator.add(2, 2)),
				()-> assertEquals(40, calculator.add(20, 20)),
				()-> assertEquals(50, calculator.add(30, 20))
				);
	}
	
	@Test
	public void assertNotNullTest() {
		//assertNull(calculator);
		//assertDoesNotThrow(()-> calculator.add(2, 2));
	}
	
	
	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}
}
