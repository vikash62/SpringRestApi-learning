package com.bridgelabz.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.springrestapi.model.Employee;
import com.bridgelabz.springrestapi.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eService;
	
//	 @GetMapping("/employees")
//	 public String getEmployees() {
//		 return " displaying list of employee";
//	 }
	 @GetMapping("/employees")
	 public List<Employee> getEmployees() {
		 return eService.getEmployees();
	 }
	 
	 @GetMapping("/employees/{id}") 
	 public Employee getEmployee(@PathVariable Long id) 
	 {
		 return eService.getSingleEmployee(id);
	 }
	 @DeleteMapping("/employes")
	 public void deleteEmployee(@RequestParam Long id) {
		 eService.DeleteEmployee(id);
	 }
	 @PostMapping("/employees")
	 public Employee saveEmployee(@RequestBody Employee employee) {
		 return eService.saveEmployee(employee);
	 }
} 
