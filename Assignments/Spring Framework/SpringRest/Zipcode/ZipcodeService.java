package com.springrest.SpringRest.Zipcode;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ZipcodeService {

	private Map<String, City> zipCodes = new HashMap<>();

	public ZipcodeService() {
		zipCodes.put("123456", new City("Kerala", "Cochin", "India"));
		zipCodes.put("223456", new City("Maharashtra", "Mumbai", "India"));
		zipCodes.put("323456", new City("Los Angeles", "California", "US"));
		zipCodes.put("423456", new City("Miami", "Florida", "US"));
	}

	public City getDetails(String zipcode) {
		return zipCodes.get(zipcode);
	}
}
