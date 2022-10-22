package com.bridgelabz.springrestapi.service;

import java.util.List;

import com.bridgelabz.springrestapi.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();
    Employee saveEmployee(Employee employee);
}
