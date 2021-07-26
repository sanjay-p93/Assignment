package com.registration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CityZipcodeList {

	Map<String, String> zipCodes = new HashMap<>();

	public CityZipcodeList() {
		zipCodes.put("123456", "Cochin");
		zipCodes.put("223456", "Cochin");
		zipCodes.put("323456", "Chennai");
		zipCodes.put("423456", "Cochin");
		zipCodes.put("523456", "Delhi");
		zipCodes.put("623456", "Mumbai");
		zipCodes.put("723456", "Mumbai");
	}

	public Map<String, String> getZipCodes() {
		return zipCodes;
	}

	public void setZipCodes(Map<String, String> zipCodes) {
		this.zipCodes = zipCodes;
	}

}
