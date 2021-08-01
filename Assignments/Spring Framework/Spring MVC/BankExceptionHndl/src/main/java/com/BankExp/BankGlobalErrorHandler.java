package com.BankExp;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BankGlobalErrorHandler {


	@ExceptionHandler(value = BankAccountNotFoundException.class)
	public String erroHndle(Exception e) {

		System.out.println("----- BankAccountNotFoundException----");
		System.out.println(e.getMessage());
		return "error";
	}

	@ExceptionHandler(value = LowBalanceException.class)
	public String erroHndle1(Exception e) {

		System.out.println("----- LowBalanceException----");
		System.out.println(e.getMessage());
		return "error";
	}
	@ExceptionHandler({ NullPointerException.class })
	public String nullHandle() {
		System.out.println("----------NullPointerException-----------");
		return "error";
	}

	@ExceptionHandler({ Exception.class })
	public String notFountGlobal(Exception e) {
		System.out.println("----------CaughtApplicationException-----------");
		System.out.println(e.getClass());
		return "error";
	}

}