package com.springrest.SpringRest.RestTemplate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/restTemplate")
public class MathRestTemplateController {

	RestTemplate restTemplate = new RestTemplate();

	@PostMapping("/add")
	public double add(@RequestBody Params params) {
		ResponseEntity<Double> response = restTemplate.postForEntity("http://localhost:8080/math/add", params,
				Double.class);
		return response.getBody();
	}

	@PostMapping("/sub")
	public double sub(@RequestBody Params params) {
		ResponseEntity<Double> response = restTemplate.postForEntity("http://localhost:8080/math/sub", params,
				Double.class);
		return response.getBody();
	}

	@PostMapping("/mul")
	public double mul(@RequestBody Params params) {
		ResponseEntity<Double> response = restTemplate.postForEntity("http://localhost:8080/math/mul", params,
				Double.class);
		return response.getBody();
	}

	@PostMapping("/div")
	public double div(@RequestBody Params params) {
		ResponseEntity<Double> response = restTemplate.postForEntity("http://localhost:8080/math/div", params,
				Double.class);
		return response.getBody();

	}

	@GetMapping("/sqrt/{n}")
	public double sqrtNum(@PathVariable double n) {
		String uri = "http://localhost:8080/math/sqrt/" + n;
		double sqrt = restTemplate.getForObject(uri, Double.class);
		return sqrt;
	}

}
