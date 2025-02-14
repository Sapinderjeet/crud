package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.Employee;
import com.spring.crud.repository.EmployeeCrudRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	@Autowired
	private EmployeeCrudRepo crudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = crudRepo.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> findAll() {
		return crudRepo.findAll();
	}

	@Override
	public Employee getEmpbyId(int empid) {
		return crudRepo.findById(empid).get();
	}

	@Override
	public void deleteEmployee(int empid) {
		crudRepo.deleteById(empid);
	}

}
