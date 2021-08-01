package com.springrest.SpringRest.Zipcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipController {

	@Autowired
	ZipcodeService zipcodeService;

	@GetMapping("/zipcode/{zipcode}")
	public City zipDetails(@PathVariable String zipcode) {

		return zipcodeService.getDetails(zipcode);
	}
	
}
