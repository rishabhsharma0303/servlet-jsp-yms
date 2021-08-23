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

class CalculatorTest {

	private Calculator calculator;
	
	@BeforeAll
	public static void beforeAllTest() {
		System.out.println("beofre any test case");
	}
	
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}
	
	//@Disabled
	//@EnabledOnOs(OS.LINUX)
	//@EnabledOnJre(JRE.JAVA_14)
	@DisplayName("adding two numbers v2")
	@Test
	void add2Test() {
		assertEquals(7, calculator.add(2, 5));
	}

	@Tag(value = "dev")
	@DisplayName("adding two numbers v1")
	@Test
	void addTestV1() {
		System.out.println("i run in dev env");
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Tag(value = "test")
	@DisplayName("adding two numbers v2")
	@Test
	void addTestV2() {
		System.out.println("i run in test env");
		assertEquals(4, calculator.add(2, 2));
	}
	
	
	
//	@DisplayName("adding two numbers v2")
//	@Test
//	//@RepeatedTest(value = 3)
//	void addTest(TestInfo info) {
//		//System.out.println(info.getDisplayName().toString());
//		//System.out.println(info.getClass().getName());
//		assertEquals(4, calculator.add(2, 2));
//	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}
}
