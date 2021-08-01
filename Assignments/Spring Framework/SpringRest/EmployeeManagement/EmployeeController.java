package com.springrest.SpringRest.EmployeeManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/list")
	public List<Employee> listAll() {
		return employeeService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Employee> findById(@PathVariable int id) {
		return employeeService.findById(id);
	}

	@PostMapping("/add")
	public void addnew(@RequestBody Employee employee) {
		employeeService.add(employee);
	}

	@GetMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		employeeService.deleteById(id);
	}

	@PostMapping("/update")
	public void deleteById(@RequestBody Employee employee) {
		employeeService.update(employee);
	}
}
