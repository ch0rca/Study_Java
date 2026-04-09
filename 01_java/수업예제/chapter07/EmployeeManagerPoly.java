package chapter07;

import java.util.Arrays;

public class EmployeeManagerPoly {
	
	/** 다형성을 배열에 적용 
	 *  Manager와 Engineer는 Employee로 자동 형변환 되므로 
	 *  Employee타입의 배열을 선언하면 Employee,  Manager, Engineer 도 저장할 수 있다. 
	 *  ==> super타입으로 선언하면 모든 sub를 참조할 수 있다. 
	 *  */
	/**일반 사원을 저장하는 배열 */
	private Employee[] emps;
	
	/**저장할 위치 & 현재 저장된 데이타 개수  */
	private int empIndex;
	public EmployeeManagerPoly() {
		emps = new Employee[10]; //배열 객체만 생성됨. 
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
	
	
	/**
	 * 다형성을 리턴 타입에 적용 
	 * 모든 sub는 super 타입으로 자동 형변환이 되므로 리턴 타입을 super 타입으로 선언하면 
	 * 모든 sub를 리턴할 수 있다.    
	 * */
	/**사원번호에 해당하는 사원을 검색해서 해당 사원의 정보를 리턴 */
	public Employee findEmployee(String empno) {
		//return new Manager();
		int index  = findIndex(empno);		
		if(index > -1) return emps[index];
		return null;
	}
	
	/** 다형성을 메소드 인자에 적용하기 
	 * 모든 sub는 super 타입으로 자동 형변환이 되므로 인자를 super 타입으로 선언하면
	 * 모든 sub를 인자로 전달 받을 수 있다.   ==> Overloading을 줄일 수 있다. 
	 * 
	 * */
	/** 사원번호가 이미 등록된 경우 등록하지 않고 사원 정보를 등록 하는 기능*/
	public void add(Employee emp) {
		if(emp != null) {
			String empno = emp.getEmpno();
			int index = findIndex(empno);
			if(index > -1) {
				System.err.printf("%s번은 이미 등록된 사원번호입니다. %n", empno);
			}else {
				//등록하기 
				//저장할 공간이 있는지 검사
				if(empIndex>= emps.length) { //저장할 공간이 없음
					emps = Arrays.copyOf(emps, empIndex+5);
				}
				emps[empIndex++] = emp;
			}
		}
	}
	
	/** 사원번호에 해당하는 사원정보를 수정하는 함수  */
	public void update(Employee emp) {
		if(emp !=null) {
			String empno = emp.getEmpno();
			int index = findIndex(empno);
			if(index >-1) {
				emps[index] = emp;
				return;
			}
		}
		System.err.println("잘못된 사원 정보로 수정할 수 없습니다. ");
	}
	
	public void remove(String empno) {
		int index = findIndex(empno);
		if(index > -1) {
			//맨 마지막에 있는 요소를 삭제할려는 위치에 덮어쓰기 ==> 현재 위치에 저장된 정보는 삭제됨. 
			emps[index] = emps[--empIndex];
			return;
		}
		System.err.printf("%s번은 등록되지 않은 사원이므로 삭제할 수 없습니다.",empno);
	}
	
	public void print() {
		for (int i = 0; i < empIndex; i++) {
			System.out.println(emps[i].toString());  //Virtual Invoke
		}
	}
	
}











