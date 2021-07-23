package com.intrestCal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleIntrestController {

	@RequestMapping(value = "/Intrest", method = RequestMethod.GET)
	public String Index() {
		return "simpleIntrest";
	}

	@RequestMapping(value = "/Intrest", method = RequestMethod.POST)
	public String computeSimpleIntrest(@RequestParam("principleAmount") float principleAmount,
			@RequestParam("period") float period, @RequestParam("rate") float rate, ModelMap model) {
		float intrest=(rate *period*principleAmount)/100;
		model.put("intrest", intrest);
		System.out.println(rate + " " + period + " " + principleAmount);
		return "result";
	}
}
