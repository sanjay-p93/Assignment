package com.springrest.SpringRest.UserAuth;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public String authUser(User user) {
		if (user.getUserName().equals("admin") && user.getPassword().equals("123456"))
			return "Valid user";
		return "Invalid User";
	}
}
