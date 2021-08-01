package com.springrest.SpringRest.OrderManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		List<Order> order = new ArrayList<>();
		orderRepository.findAll().forEach(order::add);
		return order;
	}

	public void add(Order employee) {
		orderRepository.save(employee);
	}

	public Optional<Order> findById(int id) {
		return orderRepository.findById(id);
	}

	public void update(Order order) {
		orderRepository.save(order);
	}

	public void deleteById(int id) {
		orderRepository.deleteById(id);
	}
}
