package com.bridgelabz.springrestapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	 @GetMapping("/employees")
	 public String getEmployees() {
		 return " displaying list of employee";
	 }
	 
	 @GetMapping("/employees/{id}")
//	 public String getEmployee(@PathVariable("id")Long id) 
	 public String getEmployee(@PathVariable Long id) 
	 {
		 return " displaying list of employee id"+id;
	 }
	 @DeleteMapping("/employes")
	 public String deleteEmployee(@RequestParam("id")Long id) {
		 return " delete list of employee for id"+id;
	 }
} 
