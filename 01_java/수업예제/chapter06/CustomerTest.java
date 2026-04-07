package chapter06;

public class CustomerTest {

	public static void main(String[] args) {
//		int i;
//		System.out.println(i);
//		객체 선언
		Customer cust  = null;
//		객체 생성 
		cust = new Customer("ureca",4,"서울 서초구");
//		접근     
//		cust.name="ureca";
//		cust.age=4;
//		cust.address="강남구 역삼동";
		System.out.println(cust.customerInfo());
		
		Customer cust2 = new Customer("uplus",30, "서울");
		System.out.println(cust2.customerInfo());
		
//		System.out.println(new Customer().customerInfo());
//		System.out.println(new Customer("홍길동", 17, "율도국").customerInfo());
//		
		System.out.println(cust.equals(cust2));
		
	}
}





