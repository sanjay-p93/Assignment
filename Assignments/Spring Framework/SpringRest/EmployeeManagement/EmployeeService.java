package com.springrest.SpringRest.EmployeeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	public void add(Employee employee) {
		employeeRepository.save(employee);
	}

	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}

	public void update(Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}
}
