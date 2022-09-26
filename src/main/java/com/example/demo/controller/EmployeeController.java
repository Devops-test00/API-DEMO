package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path="/employee/api/")
@CrossOrigin(origins = "*")
public class EmployeeController {

	EmployeeService productservice;
	
	@RequestMapping(path="get")
	public Employee getAllEmployee() {
		Employee emp=new Employee();
		emp.setDepartment("ECE");
		emp.setEmail("premsai@gmail.com");
		emp.setEmplyeeId(46573);
		emp.setName("premsai");
		emp.setSalary(50000);
		
		return emp;
	}
	
	
	
}
