package com.employeeManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	@Autowired
	EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("list");
		System.out.println(employeeDao.findAll());

		System.out.println("\nfind id");
		System.out.println(employeeDao.findById(1));

		System.out.println("\n delete");
		System.out.println(employeeDao.deleteById(3));
		System.out.println(employeeDao.findAll());

		System.out.println("\n insert");
		System.out.println(employeeDao.insert(new Employee(5, "james", "ee", "ahod", 80000)));
		System.out.println(employeeDao.findAll());

		System.out.println("\n update");
		System.out.println(employeeDao.update(new Employee(1, "john honai", "cs", "hod", 150000)));
		System.out.println(employeeDao.findAll());

		System.out.println("employee 2 list");
		System.out.println(employeeDao.findAll2());

	}

}
