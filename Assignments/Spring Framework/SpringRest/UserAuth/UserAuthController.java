package com.springrest.SpringRest.UserAuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthController {

	@Autowired
	AuthenticationService authenticationService;

	@PostMapping("/auth")
	public String Auth(@RequestBody User user) {
		return authenticationService.authUser(user);
	}

}
