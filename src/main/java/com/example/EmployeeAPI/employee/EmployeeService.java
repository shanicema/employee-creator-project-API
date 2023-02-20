package com.example.EmployeeAPI.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public String hello() {
		return "Hello there!";
	}

	public List<Employee> all() {
		return this.repository.findAll();
	}

	public Optional<Employee> findOne(Long employeeId) {
		return this.repository.findById(employeeId);
	}
	
}
