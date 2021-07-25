package com.registration;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityZipcodeConstraintValidator implements ConstraintValidator<CityZipcode, Object> {

	@Autowired
	private CityZipcodeList cityZipcodeList;

	private String city;
	private String zipCode;

	public void initialize(CityZipcode constraintAnnotation) {
		this.city = constraintAnnotation.city();
		this.zipCode = constraintAnnotation.zipCode();
	}

	public boolean isValid(Object value, ConstraintValidatorContext context) {

		Object cityValue = new BeanWrapperImpl(value).getPropertyValue(city);
		Object zipCodeValue = new BeanWrapperImpl(value).getPropertyValue(zipCode);

		if (cityValue == null || zipCodeValue == null || !cityZipcodeList.getZipCodes().containsKey(zipCodeValue))
			return false;

		if (cityZipcodeList.getZipCodes().get(zipCodeValue).equals(cityValue))
			return true;

		return false;
	}
}
