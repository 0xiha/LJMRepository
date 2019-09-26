package com.atguigu.ssh.service;

import java.util.List;

import com.atguigu.ssh.dao.EmployeeDao;
import com.atguigu.ssh.entities.Employee;

public class EmployeeService {

	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void delete(Integer id) {
		employeeDao.delete(id);
	}

	public List<Employee> getAll() {
		List<Employee> employees = employeeDao.getAll();
		// employees.clear();
		return employees;
	}

}
