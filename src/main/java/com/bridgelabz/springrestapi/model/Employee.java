package com.bridgelabz.springrestapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {

	private String name;
	private Long age;
	private String email;
	private String department;

}
