package com.ureca.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ureca.model.dao.EmployeeDao;
import com.ureca.model.dto.Employee;
import com.ureca.util.EmployeeFactory;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDao dao = EmployeeFactory.getEmployee();
	
	////////////////TODO 09. 사원 번호에 해당하는 사원 정보를 리턴하기   
	@Override
	public Employee findEmployee(String empno) {
		return null;
	}

	////////////////TODO 10. 사원 정보 저장하기   
	@Override
	public void add(Employee emp) {
		
	}

	public void update(Employee emp) {
		findEmployee(emp.getEmpno());
		dao.update(emp);
	}
	
	public void remove(String empno) {
		findEmployee(empno);
		dao.remove(empno);
	}

	public void close() {
		System.exit(0);
//		dao.close();
	}

	public List<Employee> searchAll() {
		return dao.searchAll();
	}
}












