package com.ureca.util;

import com.ureca.model.dao.EmployeeDao;
import com.ureca.model.dao.EmployeeDaoMemory;

public class EmployeeFactory {
	////////////////TODO 08. EmployeeDao 객체 생
	private static final  EmployeeDao dao  = new EmployeeDaoMemory() ;
	public static EmployeeDao getEmployee() {
		return dao;
	}
}
