package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.entity.Employee;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee, Integer> {

	
}
