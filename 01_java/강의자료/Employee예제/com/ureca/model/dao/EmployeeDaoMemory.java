package com.ureca.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ureca.model.dto.Employee;

public class EmployeeDaoMemory implements EmployeeDao {
	private ArrayList<Employee> emps;
	public EmployeeDaoMemory() {
		emps = new ArrayList<Employee>(10);
	}
	public ArrayList<Employee> getEmps() {
		return emps;
	}
	public void setEmps(ArrayList<Employee> emps) {
		this.emps = emps;
	}
	
	////////////////TODO 01. 사원 번호에 해당하는 index 리턴하기 
	private int findIndex(String empno) {
		
		return -1;
	}
	
	////////////////TODO 02. 사원 번호에 해당하는 사원 정보 리턴하기 
	public Employee findEmployee(String empno) {
			return null;
	}
	
	
	////////////////TODO 03. 사원정보 등록하기 
	public void add(Employee emp) {
		emps.add(emp);
	}
	
	////////////////TODO 04. 사원정보 수정하기 
	public void update(Employee emp) {

	}

	////////////////TODO 06. 사원정보 삭제하기
	public void remove(String empno) {

	}

	////////////////TODO 07. 모든 사원 정보를 전달하기 
	public List<Employee> searchAll() {
		return null;
	}

	public void close() {
		System.exit(0);
	}

}
