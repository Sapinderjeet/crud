package com.spring.crud.service;

import java.util.List;

import com.spring.crud.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> findAll();

	public Employee getEmpbyId(int empid);

	public void deleteEmployee(int empid);

}
