package com.employeeManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Employee> findAll() {
		return jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}


	@SuppressWarnings("deprecation")
	public Employee findById(int id) {
		return jdbcTemplate.queryForObject("select * from employee where employeeId=?", new Object[] { id },
				new BeanPropertyRowMapper<Employee>(Employee.class));
	}


	public int deleteById(int id) {
		return jdbcTemplate.update("delete from employee where employeeId=?", new Object[] { id });
	}

	public int insert(Employee emp) {
		return jdbcTemplate.update(
				"INSERT INTO EMPLOYEE(employeeName, employeeDepartment, employeeDesignation, employeeSalary) "
						+ "VALUES(?,?,?,?)",
				new Object[] { emp.getEmployeeName(), emp.getEmployeeDepartment(),
						emp.getEmployeeDesignation(), emp.getEmployeeSalary() });
	}

	public int update(Employee emp) {
		return jdbcTemplate.update(
				"update employee set employeeName = ?, employeeDepartment = ?, employeeDesignation = ?, employeeSalary = ? "
						+ "where employeeId=? ",
				new Object[] { emp.getEmployeeName(), emp.getEmployeeDepartment(), emp.getEmployeeDesignation(),
						emp.getEmployeeSalary(), emp.getEmployeeId() });
	}


	// testing row mapper

	class EmployeeRowMapper implements RowMapper<Employee2> {

		@Override
		public Employee2 mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee2 employee2 = new Employee2();
			employee2.setId(rs.getInt("employeeId"));
			employee2.setName(rs.getString("employeeName"));
			employee2.setDepartment(rs.getString("employeeDepartment"));
			employee2.setDesignation(rs.getString("employeeDesignation"));
			employee2.setSalary(rs.getInt("employeeSalary"));
			return employee2;
		}

	}

	public List<Employee2> findAll2() {
		return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
	}

}
