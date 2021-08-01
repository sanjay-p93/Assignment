package com.securityLogin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.securityLogin.models.User;

@Service
public class UserCrudServices {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {

		List<User> user = new ArrayList<>();
		userRepository.findAll().forEach(user::add);
		System.out.println(user);
		return user;
	}

	public void add(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}
}
