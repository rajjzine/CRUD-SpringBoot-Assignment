package com.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcrud.bean.Employee;
import com.springbootcrud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService empService;

	@RequestMapping("/employee")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployee();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employee")
	public void addEmployee(@RequestBody Employee employee) {
		empService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employee/{id}")
	public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
		empService.updateEmployee(id, employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employee/{id}")
	public void deleteEmployee(@PathVariable String id) {
		empService.deleteEmployee(id);
	}
	
}
