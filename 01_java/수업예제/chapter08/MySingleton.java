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
	/*
	 * 1.Thread safe하게 singleton 객체 생성하기
	 *     ==> 클래스 로딩과 static 처리는 JVM이 Thread safe하게 처리함.  
	 */
//	private static MySingleton instance = new MySingleton();
	/*
	 * LazyHolder
	 *  - 처음 getInstance()를 호출 할때 객체를 한번 생성하는 기법
	 *  - static Nested 클래스에서 singleton 객체를 생성한다.  
	 */
	private static class LazyHolder{
		private static final MySingleton instance = new MySingleton(); 
	}
	private MySingleton() {}
	public static MySingleton getInstance() {
//		if(instance ==null) {
//			instance = new MySingleton();
//		}
//		return instance;
		return LazyHolder.instance;
    }
	
}









