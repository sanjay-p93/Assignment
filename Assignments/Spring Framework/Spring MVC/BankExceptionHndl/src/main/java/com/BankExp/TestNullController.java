package com.BankExp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestNullController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String Index(ModelMap model) throws NullPointerException {

			throw new NullPointerException();
	}

}
