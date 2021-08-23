package com.cal;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
public class DemoTestOrder {

	@Order(value = 1)
	@Test
	public void addEmp() {
		System.out.println("add Emp ...");
	}
	@Order(value = 2)
	@Test
	public void delEmp() {
		System.out.println("del Emp ...");
	}
	@Order(value = 4)
	@Test
	public void updateEmp() {
		System.out.println("update Emp ...");
	}
	@Order(value = 3)
	@Test
	public void getEmp() {
		System.out.println("get an Emp ...");
	}

}
