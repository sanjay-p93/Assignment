package com.security.SecurityA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String hello() {
		return "<h1>Hello World<h1><br>";
	}

	@GetMapping("/user")
	public String helloUser() {
		return ("<h1>Hello User</h1><a href='/logout'>Logout<a>");
	}

	@GetMapping("/admin")
	public String helloAdmin() {
		return ("<h1>Hello Admin</h1><a href='/logout'>Logout<a>");
	}
}