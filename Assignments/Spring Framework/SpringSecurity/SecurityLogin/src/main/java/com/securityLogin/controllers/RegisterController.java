package com.securityLogin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.securityLogin.UserCrudServices;
import com.securityLogin.models.User;


@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	UserCrudServices userCrudServices;

	@PostMapping("/adduser")
	public void addnew(@RequestBody User user) {
		userCrudServices.add(user);
	}

	@GetMapping("/list")
	public List<User> listAll() {
		return userCrudServices.findAll();
	}

}
