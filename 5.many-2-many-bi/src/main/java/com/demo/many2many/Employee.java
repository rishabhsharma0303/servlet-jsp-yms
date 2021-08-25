package com.demo.many2many;

import java.util.*;
public class Employee {
	private int empId;
	private String empName;

	private List<Project> projects = new ArrayList<Project>();
}
