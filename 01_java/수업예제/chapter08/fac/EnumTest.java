package chapter08.fac;

public class EnumTest {
	public static void main(String[] args) {
		
		//enum은 Enum 클래스를 상속 받기 때문에 다른 클래스를 상속 받을 수 없다. 
		//그러나 interface는 구현받을 수 있다. 
		Command command = PhoneCommand.CALL;
	}
}
