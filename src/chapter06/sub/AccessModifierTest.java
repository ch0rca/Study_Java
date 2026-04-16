package chapter06.sub;

import chapter06.Customer;

class Modi{
	String name;
	private int age=4;
	public void test() {
		System.out.println("name :"+name+" age:"+age);
	}
}

public class AccessModifierTest {
	public static void main(String[] args) {
		Modi m = new Modi();
		m.name="ureca";				// Modi와 AccessModifierTest는 같은 package 이므로 name에  접근 가능 
		
//		m.age = 4;					// age는 private로 선언했기 때문에 외부 클래스에서는 접근 불가
		
//		Customer는 public으로 선언됐기 때문에 다른 package에서도 접근 가능   
		Customer cust = new Customer();
//		cust.name="uplus";			// Customer의 name 속성은 defualt로 선언됐기 때문에 다른 패키지에서 접근 불가
	}
}




