package chapter11;

import chapter07.Employee;

public class ExcepTest4 {
	public static void main(String[] args) {
		
		try {
			//몇 몇 error를 제외하면 error를 Throwable로 처리 가능 
			Employee[] emps1 = new Employee[2111111111];
			Employee[] emps2 = new Employee[2111111111];
			Employee[] emps3 = new Employee[2111111111];
		} catch (Throwable e) {
			
			System.out.println("메모리가 부족합니다.");
		}
		
		System.out.println("main end.....");
	}
}
