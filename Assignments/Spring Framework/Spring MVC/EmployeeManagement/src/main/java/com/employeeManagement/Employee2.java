package com.employeeManagement;

import javax.validation.constraints.NotNull;

public class Employee2 {

	private int Id;

	@NotNull
	private String Name;

	@NotNull
	private String Department;

	@NotNull
	private String Designation;

	@NotNull
	private int Salary;

	public Employee2() {
		super();
	}

	public Employee2(int id, @NotNull String name, @NotNull String department, @NotNull String designation,
			@NotNull int salary) {
		super();
		Id = id;
		Name = name;
		Department = department;
		Designation = designation;
		Salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [Id=" + Id + ", Name=" + Name + ", Department=" + Department + ", Designation=" + Designation
				+ ", Salary=" + Salary + "]";
	}

}
