package com.springrest.SpringRest.CustomerManagement;

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
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/list")
	public List<Customer> listAll() {
		return customerService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Customer> findById(@PathVariable int id) {
		return customerService.findById(id);
	}

	@PostMapping("/add")
	public void addnew(@RequestBody Customer employee) {
		customerService.add(employee);
	}

	@GetMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		customerService.deleteById(id);
	}

	@PostMapping("/update")
	public void deleteById(@RequestBody Customer employee) {
		customerService.update(employee);
	}
}
