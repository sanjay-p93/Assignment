package com.springrest.SpringRest.CreditCard;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CardConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CardValidate {

	public String message() default "Invalid Card!";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String type();

	String number();

	@Target({ ElementType.TYPE })
	@Retention(RetentionPolicy.RUNTIME)
	@interface List {
		CardValidate[] value();
	}

}
