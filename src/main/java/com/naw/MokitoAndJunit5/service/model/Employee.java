package com.naw.MokitoAndJunit5.service.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
	private Integer id;
	private String email;
	private BigDecimal bonus;
	private Date doj;
	private String employeeName;
	private Double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", bonus=" + bonus + ", doj=" + doj + ", employeeName="
				+ employeeName + ", salary=" + salary + "]";
	}
	
	

}
