package chapter07;

/**
 * String
 *  - 문자열을 표현하는 API
 *  - new 없이 객체를 생성할 수 있는 유일한 API
 *      new 없이 사용 (Literal)  => Literal Pool에 저장, 재사용됨.  interned String
 *         
 *      new 생성 				   => heap에 생성이 된다. 
 */
public class StringTest {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.printf(" str1==str2  %b%n", str1==str2);
		System.out.printf(" str1==str3  %b%n", str1==str3);
		System.out.printf(" str3==str4  %b%n", str3==str4);
		
				
		System.out.println(str1.replace('h', 'k'));
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}
}












