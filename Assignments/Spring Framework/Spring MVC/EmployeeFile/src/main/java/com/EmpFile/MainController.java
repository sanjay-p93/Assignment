package com.EmpFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewHome() {
		return "Index";
	}

	@RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
	public ModelAndView downloadExcel() {
		return new ModelAndView(new ExcelBuilder(), "employees", employeeRepository.getEmp());
	}

	@RequestMapping(value = "/downloadPdf", method = RequestMethod.GET)
	public ModelAndView downloadPdf() {
		return new ModelAndView(new PdfBuilder(), "employees", employeeRepository.getEmp());
	}
}