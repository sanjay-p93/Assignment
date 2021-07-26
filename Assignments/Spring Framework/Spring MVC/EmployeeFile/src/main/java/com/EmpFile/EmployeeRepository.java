package com.EmpFile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	public List<Employee> getEmp() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "jhon", 20000));
		employees.add(new Employee(2, "Jane", 25000));
		employees.add(new Employee(3, "rambo", 100000));
		employees.add(new Employee(4, "rocky", 60000));
		employees.add(new Employee(5, "jack", 80000));
		employees.add(new Employee(6, "sarah", 65000));
		return employees;
	}
}
