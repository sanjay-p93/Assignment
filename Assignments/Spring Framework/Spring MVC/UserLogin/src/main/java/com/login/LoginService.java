package com.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isValidUser(User user) {

		if (user.getUsername().equals("admin") && user.getPassword().equals("123456"))
			return true;
		return false;
	}
}
