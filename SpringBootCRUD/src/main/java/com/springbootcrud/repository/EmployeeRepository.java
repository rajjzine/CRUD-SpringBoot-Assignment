package com.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootcrud.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
