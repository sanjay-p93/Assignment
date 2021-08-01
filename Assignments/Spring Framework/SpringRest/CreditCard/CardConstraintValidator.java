package com.springrest.SpringRest.CreditCard;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Service;

@Service
public class CardConstraintValidator implements ConstraintValidator<CardValidate, Object> {

	private String type;
	private String number;

	@Override
	public void initialize(CardValidate arg0) {
		this.type = arg0.type();
		this.number = arg0.number();

	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext cntxt) {

		Object typeVal = new BeanWrapperImpl(value).getPropertyValue(type);
		Object numberVal = new BeanWrapperImpl(value).getPropertyValue(number);

		if (typeVal == null || numberVal == null)
			return false;
		
		String cardType =typeVal.toString();
		String cardNumber =numberVal.toString();

		switch (cardType) {
		case "American Express":
			int numAmEx = Integer.parseInt(cardNumber.substring(0, 6));
			if (cardNumber.length() == 16
					&& ((numAmEx >= 601100 && numAmEx >= 601109) || (numAmEx >= 601120 && numAmEx >= 601149)
							|| numAmEx == 601174 || (numAmEx >= 601177 && numAmEx >= 601179)
							|| (numAmEx >= 601186 && numAmEx >= 601199) || (numAmEx >= 644000 && numAmEx >= 659999))) {
				return true;
			}
			return false;
		case "enRoute":
			String numEnR = cardNumber.substring(0, 4);
			if (cardNumber.length() == 15 && (numEnR.equals("2014") || numEnR.equals("2149"))) {
				return true;
			}
			return false;
		case "JCB":
			int numJCB = Integer.parseInt(cardNumber.substring(0, 4));
			if (cardNumber.length() >= 16 && cardNumber.length() <= 19 && numJCB >= 3528 || numJCB <= 3589) {
				return true;
			}
			return false;
		case "MasterCard":
			int numMasterCard = Integer.parseInt(cardNumber.substring(0, 6));
			if (cardNumber.length() == 16 && ((numMasterCard >= 510000 && numMasterCard >= 559999)
					|| (numMasterCard >= 222100 && numMasterCard >= 272099))) {
				return true;
			}
			return false;
		case "Visa":
			if (cardNumber.length() <= 19 && cardNumber.charAt(0) == '4') {
				return true;
			}
			return false;
		default:
				return false;
		}
	}

}
