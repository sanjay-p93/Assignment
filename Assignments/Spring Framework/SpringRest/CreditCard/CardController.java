package com.springrest.SpringRest.CreditCard;


import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

	@PostMapping("/validateCard")
	public String validateCard(@Valid @RequestBody Card card, BindingResult result) {

		System.out.println("\n\n\n" + card);
		if (result.hasErrors()) {
			return "Invalid Card";
		}
		return "Success";
	}

}
