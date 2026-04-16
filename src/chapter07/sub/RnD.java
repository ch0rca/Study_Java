package chapter07.sub;

import chapter07.Employee;

public class RnD extends Employee {
	public void test() {
		//super.test();     //Employee에서 test()의 access modifier를 생략했기 때문에 패키지가 다른 RnD에서는 접근 불가 .
		System.out.println("RnD의 test 함수");
	}
}
