package com.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String Index() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("user") User user, BindingResult result, ModelMap model) {
		System.out.println(result.hasErrors());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		if(result.hasErrors()) {
			return "error";
		}
		if (loginService.isValidUser(user))
			return "success";
		return "error";
	}
}
