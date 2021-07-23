package com.registration;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isValidUser(User user, List<User> ulist) {

		for (User u : ulist) {
			if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
