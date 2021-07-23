package com.registration;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

	public boolean RegsiterUser(User user) {

		if (user.getUsername() != null && user.getPassword() != null && user.getEmail() != null
				&& !(user.getUsername().equals("") || (user.getPassword().equals("")) || user.getEmail().equals("")))
			return true;
		return false;
	}

}
