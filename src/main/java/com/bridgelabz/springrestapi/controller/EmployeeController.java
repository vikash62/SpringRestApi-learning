package com.bridgelabz.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	 @GetMapping("/employees")
	 public String getEmployees() {
		 return " displaying list of employee";
	 }
}
