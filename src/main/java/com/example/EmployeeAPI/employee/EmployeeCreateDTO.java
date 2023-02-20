package com.example.EmployeeAPI.employee;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeCreateDTO {

	@NotBlank
	String firstName;
	
	@NotBlank
	String lastName;
	
	@NotBlank
	String email;
	
	@NotBlank
	String contractType;
	
	@NotNull
	Date startDate;
	
	@NotNull
	Date finishDate;
	
	public EmployeeCreateDTO() {
		
	}
	
	public EmployeeCreateDTO(String firstName, String lastName, String email, String contractType, Date startDate, Date finishDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
}
