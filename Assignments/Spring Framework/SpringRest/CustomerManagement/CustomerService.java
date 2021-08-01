package com.springrest.SpringRest.CustomerManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		List<Customer> employees = new ArrayList<>();
		customerRepository.findAll().forEach(employees::add);
		return employees;
	}

	public void add(Customer employee) {
		customerRepository.save(employee);
	}

	public Optional<Customer> findById(int id) {
		return customerRepository.findById(id);
	}

	public void update(Customer employee) {
		customerRepository.save(employee);
	}

	public void deleteById(int id) {
		customerRepository.deleteById(id);
	}
}
