package com.registration;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {


	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String Index(ModelMap model) {

		model.addAttribute("user", new Customer());
		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String computeSimpleIntrest(@Valid @ModelAttribute("user") Customer user, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {

			if (result.getFieldError("zipcode") == null && result.getGlobalError()!=null) {
				model.addAttribute("errorZip",result.getGlobalError().getDefaultMessage());
			}

			return "registration";
		}
		return "success";
	}

}
