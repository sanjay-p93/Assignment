package com.registration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CityZipcodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CityZipcode {

	// error message
	public String message() default "Zipcode doesn't match with city";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String city();

	String zipCode();

	@Target({ ElementType.TYPE })
	@Retention(RetentionPolicy.RUNTIME)
	@interface List {
		CityZipcode[] value();
	}
}
