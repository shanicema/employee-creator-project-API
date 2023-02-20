package com.example.EmployeeAPI.employee;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column
	String firstName;
	
	@Column
	String middleName;

	@Column
	String lastName;
	
	@Column
	String email;
	
	@Column
	String number;
	
	@Column
	String contractType;
	
	@Column
	String employmentType;
	
	@Column
	Integer hours;
	
	@Column
	Date startDate;
	
	@Column
	Date finishDate;
	
	@Column
	Boolean isOngoing;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String email, String contractType, Date startDate, Date finishDate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contractType = contractType;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
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

	public Boolean getIsOngoing() {
		return isOngoing;
	}

	public void setIsOngoing(Boolean isOngoing) {
		this.isOngoing = isOngoing;
	}

	

}
