package com.capgemini.employee;

public class employee {
       private long employeeNumber;
       private String Name;
       private long Salary;
       private String nameOfTheTdepartment;
       
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(long employeeNumber, String name, long salary, String nameOfTheTdepartment) {
		super();
		this.employeeNumber = employeeNumber;
		Name = name;
		Salary = salary;
		this.nameOfTheTdepartment = nameOfTheTdepartment;
	}

	public long getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	public String getNameOfTheTdepartment() {
		return nameOfTheTdepartment;
	}

	public void setNameOfTheTdepartment(String nameOfTheTdepartment) {
		this.nameOfTheTdepartment = nameOfTheTdepartment;
	}
}