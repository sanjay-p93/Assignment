package com.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

	List<User> ulist = new ArrayList<>();
	@Autowired
	LoginService loginService;
	@Autowired
	RegistrationService registrationService;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String Index() {
		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String computeSimpleIntrest(@ModelAttribute("user") User user, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		if (registrationService.RegsiterUser(user)) {
			ulist.add(user);
			return "login";
		}
		return "error";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String Login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("user") User user, BindingResult result, ModelMap model) {

		if(result.hasErrors()) {
			return "error";
		}
		if (loginService.isValidUser(user, ulist))
			return "success";
		return "error";
	}
}
