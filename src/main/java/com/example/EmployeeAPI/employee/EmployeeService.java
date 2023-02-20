package com.example.EmployeeAPI.employee;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

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

	public Employee create(EmployeeCreateDTO data) {
		String cleanedFirstName = data.getFirstName().trim();
		String cleanedLastName = data.getLastName().trim();
		String cleanedEmail = data.getEmail().trim().toLowerCase();
		
		Employee newEmployee = new Employee(cleanedFirstName, cleanedLastName, cleanedEmail, data.getContractType(), data.getStartDate(), data.getFinishDate());
		
		this.repository.save(newEmployee);
		
		return newEmployee;	
		
	}

	public boolean deleteOne(Long id) {
		Optional<Employee> maybeEmployee = this.findOne(id);
		
		if (maybeEmployee.isEmpty()) {
			return false;
		}
		
		this.repository.delete(maybeEmployee.get());
		return true;
	}
	
}
