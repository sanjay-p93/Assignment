package com.registration;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Service;

@Service
public class ContactConstraintValidator implements ConstraintValidator<Contact, String> {


	@Override
	public void initialize(Contact arg0) {
		
	}

	@Override
	public boolean isValid(String contactField, ConstraintValidatorContext context) {

		return contactField != null && contactField.matches("[0-9]+") && (contactField.length() == 10);
	}

}