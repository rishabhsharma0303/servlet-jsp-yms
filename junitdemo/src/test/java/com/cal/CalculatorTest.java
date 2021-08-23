package com.cal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("i am going to called once before any test case :@BeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before will run before every test case");
	}

	@Test
	public void test1() {
		System.out.println("test1 is running");
	}

	@Test
	public void test2() {
		System.out.println("test2 is running");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After will run after every test case");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("i am going to called once all test case runs :@AfterClass");
	}

}
