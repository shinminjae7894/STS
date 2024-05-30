package com.mysite;

import lombok.Data;

@Data
public class Employee {
	private int id;
	private String name;
	private String email;
	
	public Employee() {}
}
