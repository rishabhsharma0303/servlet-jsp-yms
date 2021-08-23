package com.cal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalculatorTestParameterized {

	private Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}
	// Parameterized test case
	//
	//@CsvSource({"1,2,3","2,3,5"})
//	@Test
//	@ParameterizedTest
//	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	public void addTest(int n1, int n2, int result) {
		assertEquals(result, calculator.add(n1, n2));
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}
}


