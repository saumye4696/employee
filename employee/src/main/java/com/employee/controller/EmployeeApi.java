package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeApi {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path = "/addEmployee")
	public String addEmployee(@RequestBody EmployeeEntity employee) {
		employeeService.addEmployee(employee);
		return "saved...";
	}
	
	@GetMapping(value = "/getAllEmployees")
	public List<EmployeeEntity> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
