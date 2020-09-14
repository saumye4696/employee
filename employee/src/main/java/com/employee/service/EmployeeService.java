package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;

@Service(value = "employeeService")
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public void addEmployee(EmployeeEntity employee) {
		employeeDao.save(employee);
	}
	
	public List<EmployeeEntity> getAllEmployees(){
		return employeeDao.findAll();
	}
}
