package chapter06;

import chapter05.PassByValue2;

//import  : 다른 package에 있는 클래스를  사용할 수 있도록 등록하는 기능 



public class PackageTest {

	public static void main(String[] args) {
		
		//같은 package에 있는 클래스는 package명을 생략하고 클래스 이름으로 접근 가능 
		Customer cust = new Customer();
		
//		다른 package에 있는 클래스 
//		chapter05.PassByValue2 pb = new chapter05.PassByValue2(); 
		
//		다른 package에 있는 클래스 import 한경우 
		PassByValue2 pb = new PassByValue2();
	}
}
