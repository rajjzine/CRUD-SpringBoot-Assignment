package com.springbootcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrud.bean.Employee;
import com.springbootcrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> employees = new ArrayList<Employee>();
		empRepo.findAll().forEach(employees::add);
		return employees;
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);
	}

	public void updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);
	}

	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
	}
	
	
}
