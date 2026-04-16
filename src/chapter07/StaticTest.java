package chapter07;

/** 
 *  instance : 특정 클래스로 부터 생성된 객체
 *  Object : 모든 객체들은 Object이다. 
 *  
 *  static : 동적인 java에게 정적인 특성을 부여 
 *    - 클래스가 로딩될 때 한번 수행됨. 
 *    - 객체 생성없이 클래스명으로 접근 가능 
 *      Class명.속성명	      Class명.메서드명(~)    
 *       
 *    속성			
 *      - 클래스가 로딩될 때  속성을 위한 메모리가 한번 static 영역에 한번 할당됨 
 *    	- 공유변수
 *    
 *    메서드 
 *    	- 클래스가 로딩될 때 binding이 됨. (static binding)
 *      - 속성이나 메서드 접근 없이 전달된 인자로만 처리하고 결과를 리턴하는 
 *        유틸리티성 메서드를 작성할 때 
 *      - 주의점 
 *        non-static 속성이나, 메서드에 접근 불가   
 *    static block 
 *      - 클래스가 로딩될 때 한번 수행되는 block 
 *      - static 속성을 초기화 하거나  또는 단 한번 수행되는 코드 작성 
 *      - 형식]
 *        static{         }
 *        
 *    instance block
 *      - 객체 생성할 때마나 생성자 보다 먼저 수행됨.
 *      - 어떤 생성자로 객체 생성하던 항상 수행되야 하는 공통기능을 작성 
 *      - 형식]  {         }
 *        
 *    Nested class 
 */
class Counter{	//Outer class, Enclosing class
	
	//Nested class //static이라도 Nested를 참조할 때 동적으로 로딩된다.
	static class Nested{  		 
		static {
			System.out.println("static Nested loading");
		}
	}
	static int scount;
	int icount;
	static {
		System.out.println("static block 수행됨");
	}
	{
		System.out.println("instance block 수행됨. ");
	}
	Counter(){
		System.out.println("생성자 수행됨. ");
		scount++;
		icount++;
	}
	public void print() {
		System.out.println("scount : "+scount);
		System.out.println("icount : "+icount);
	}
	public static void sprint() {
		System.out.println("scount : "+scount);
//		static 메서드에서는   non-static에 접근 불가 
//		System.out.println("icount : "+icount);
	}
}


/**
 * JVM이 클래스 로딩 
 *  1. 클래스의 객체를 처음 생성할 때 로딩
 *  2. 클래스의 static한 속성이나 메서드를 처음 접근 할때 
 *  
 * 사용자가 원하는 시점에 클래스 로딩 
 *  1. Class.forName("패키지를 포함한 클래스명");
 *  2. ClassLoader를 이용해서 클래스를 직접 로딩 
 */
public class StaticTest {
	public static void main(String[] args) {
//		객체 생성 없이 접근 가능 
		System.out.println(Counter.scount);
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		c1.print();
		c2.print();
		c3.print();
	}
}







