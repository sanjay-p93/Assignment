package com.BankExp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BankAccountContoller {

	@Autowired
	BankAccountService bankAccountService;

	@RequestMapping(value = "/wihtdraw", method = RequestMethod.GET)
	public String Index(ModelMap model) {

		model.addAttribute("transactionObj", new TransactionObj());
		return "wihtdraw";
	}

	@RequestMapping(value = "/wihtdraw", method = RequestMethod.POST)
	public String computeSimpleIntrest(@Valid @ModelAttribute("transactionObj") TransactionObj transactionObj,
			BindingResult result, ModelMap model) throws BankAccountNotFoundException, LowBalanceException {

		if (result.hasErrors()) {
			return "wihtdraw";
		}
		bankAccountService.withdrawAmount(transactionObj.getAccountId(), transactionObj.getAmount());
		return "success";
	}
}
