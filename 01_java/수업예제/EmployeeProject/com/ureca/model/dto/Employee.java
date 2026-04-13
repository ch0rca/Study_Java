package com.ureca.model.dto;

import java.io.Serializable;

public class Employee implements Serializable {
	private String empno;
	private String name;
	private int salary;
	public Employee() {}
	public Employee(String empno, String name, int salary) {
		setEmpno(empno);
		setName(name);
		setSalary(salary);
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary<100000) {
			this.salary=10000000;
		}else {
			this.salary = salary;
		}
	}
	@Override
	public String toString() {
		return new StringBuilder()
				.append("empno=").append(empno).append(", name=").append(name).append(", salary")
				.append(salary).append("]").toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null && obj instanceof Employee) {
			Employee emp = (Employee) obj;
			if(empno!=null && empno.equals(emp.empno)) {
				return true;
			}
		}
		return false;
	}
}




