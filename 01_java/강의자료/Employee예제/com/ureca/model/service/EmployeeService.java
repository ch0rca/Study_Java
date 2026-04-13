package com.ureca.model.service;

import java.util.List;

import com.ureca.model.dto.Employee;

public interface EmployeeService {
	Employee findEmployee(String empno);
	void add(Employee emp);
	void update(Employee emp);
	void remove(String empno);
	void close();
	List<Employee> searchAll();
}
