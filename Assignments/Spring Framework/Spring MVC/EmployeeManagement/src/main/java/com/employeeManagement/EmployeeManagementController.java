package com.employeeManagement;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeManagementController {

	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		Employee emp = new Employee();
		return new ModelAndView("AddNew", "employee", emp);
	}


	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addNew(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("AddNew", "employee", employee);
			}
		employeeDao.insert(employee);
		List<Employee> list = employeeDao.findAll();
		return new ModelAndView("EmpList", "list", list);
	}


	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listAll() {
		List<Employee> list = employeeDao.findAll();
		return new ModelAndView("EmpList", "list", list);
	}


	@RequestMapping(value = "/delete/{empId}", method = RequestMethod.GET)
	public ModelAndView Index(@PathVariable int empId) {

		employeeDao.deleteById(empId);
		List<Employee> list = employeeDao.findAll();
		return new ModelAndView("EmpList", "list", list);
	}

	@RequestMapping(value = "/edit/{empId}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable int empId) {
		Employee employee = employeeDao.findById(empId);
		return new ModelAndView("Edit", "employee", employee);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView editSubmit(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		System.out.println("\n\n" + result + "\n" + employee + "\n\n");
		if (result.hasErrors()) {
			return new ModelAndView("Edit", "employee", employee);
		}
		employeeDao.update(employee);
		List<Employee> list = employeeDao.findAll();
		return new ModelAndView("EmpList", "list", list);
	}
}
