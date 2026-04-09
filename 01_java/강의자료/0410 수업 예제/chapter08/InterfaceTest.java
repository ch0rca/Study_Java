package chapter08;

import chapter08.sub.Trans;

/**
 * interface 
 * - 상수와 추상 메서드로만 구성되어 있다. 
 *   => 딱시 선언하지 않아도 속성은 public static final로 선언이 되고 
 *      메서드는 public abstract으로 선언된다.
 *       
 * - 다중 상속이 됨.   => 다형성을 위해 다중 상속이 됨.  
 * 선언] 
 *    [public] interface 인터페이스명 [extends super인터페이스명1, ....]{ }
 *    
 * 구현]
 *    [modifiers] class 클래스명 [extends super클래스]
 *      					   [implements super인터페이스명1, ....]{ 
 *      
 *    }
 *    
 *    
 *  - Coupling 
 *  - Coheison
 *      프로그램의 한 요소가 기능을 수행하기 위해 얼마만큼의 연관된 책임과 아이디어가 뭉쳐있는지를 나타내는 정도 
 *      일반적으로 프로그램의 한 요소가 특정 목정을 위해 밀접하게 연관된 기능들이 모여서 구현되어 있고,
 *      지나치게 많은 일을 하지 않으면 그것을 응집도가 높다고 표현.
 *
 *      ==> interface를 통해 책임을 확인할 수 있다. 
 *    
 */

interface Flyer extends Cloneable, Trans{
	int INIT=3;
	void fly();
	private void test() {
		System.out.println("interface의 private 함수");
	}
	public default void defaultMethod() {
		test();
		System.out.println("interface default method ");
	} 
	public static void staticMethod() {
//		test();						//static에서는 private 함수에 접근 불가
//		defaultMethod();			//static에서는 default 함수에 접근 불가 
		System.out.println(INIT);
	}
}

class Human{
	String name;
	public void start() {
		System.out.println("걸어 봅시다.");
	}
}

class SuperMan extends Human implements Flyer{
	public SuperMan(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.println("하늘을 날아서 지구를 구해야지");
	}
	public void stop() {
		System.out.println("그만 움직이고 쉬어야징!!");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
//		public static으로 선언됐기 때문에 다른 패키지에서 객체 생성없이 접근 가능 

//		interface에 선언한 static 메서드
		
//		final로 선언되어 값 변경 불가 
		
//		SuperMan 객체를 생성하기 

		
//		SuperMan 객체가  super들로 다양하기 변하기 
		
	}
}





