package chapter08.fac;

public class FactoryTest {
	public static void main(String[] args) {
		Product p = ProductFactory.getInstance();
		p.power();
		p.service(PhoneCommand.CALL);
		Product p2 = ProductFactory.getInstance();
		p2.power();
		p2.service(PhoneCommand.PHONE_LIST);
		
		System.out.println("main end ");
	}
}
