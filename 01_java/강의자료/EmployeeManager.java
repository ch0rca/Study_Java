package chapter05;

import java.util.Arrays;

public class EmployeeManager {
	/**일반 사원을 저장하는 배열 */
	private Employee[] emps;
	private int empIndex;
	/**mgrs배열에 저장된 사원 수, 다음 저장 위치 */
	public EmployeeManager() {
		emps = new Employee[10];
	}
	
	/**
	 * 사원번호에 해당하는 사원이 저장된 배열의 index를 리턴 
	 * @param empno  찾을 사원의 사원번호
	 * @return 사원번호에 해당하는 사원을 찾은 경우 저장된 배열의 index를 리턴
	 *         못 찾은 경우 -1을 리턴
	 */
	public int findIndex(String empno) {
		if(empno != null) {
			for (int i = 0; i < empIndex; i++) {
				if(empno.equals(emps[i].getEmpno())) {
					return i;
				}
			}
		}
		return -1;
	}
	
	/**사원번호에 해당하는 사원을 검색해서 해당 사원의 정보를 리턴 */
	public Employee findEmployee(String empno) {
		
		return null;
	}
	
	/** 사원번호가 이미 등록된 경우 등록하지 않고 사원 정보를 등록 하는 기능*/
	public void add(Employee emp) {
		
	}
	
}











