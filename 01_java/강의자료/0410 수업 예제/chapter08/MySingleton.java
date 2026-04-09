package chapter08;

/**
 * Singleton Pattern
 *  - 클래스로부터 생성된 객체가 오직 하나임으로 보장하는 패턴 
 *  - 규칙
 *    1. 해당 클래스의 타입의 속성을  static으로 선언한다. 
 *    2. 생성자를 private으로 선언한다. 
 *	  3. 해당 클래스의 객체를 전달하는 메서드를 public static으로 선언한다.  
 */
public class MySingleton {
	public static MySingleton getInstance() {
		 return null;
    }
	
}









