package com.springrest.SpringRest.OrderManagement;

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
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;

	@GetMapping("/list")
	public List<Order> listAll() {
		return orderService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Order> findById(@PathVariable int id) {
		return orderService.findById(id);
	}

	@PostMapping("/add")
	public void addnew(@RequestBody Order order) {
		orderService.add(order);
	}

	@GetMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		orderService.deleteById(id);
	}

	@PostMapping("/update")
	public void update(@RequestBody Order order) {
		orderService.update(order);
	}
}
