package com.helloMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/Index")
	public String Index() {
		return "Index";
	}
	@RequestMapping(value = "/hello")
	public String sayHello() {
		return "helloWorld";
	}
}
