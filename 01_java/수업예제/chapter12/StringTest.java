package chapter12;

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
		//입력을 통해 전달되는 문자열을 생성자를 통해 객체가 생성된다. 
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.printf(" str1==str2  %b%n", str1==str2);
		System.out.printf(" str1==str3  %b%n", str1==str3);
		System.out.printf(" str3==str4  %b%n", str3==str4);
		System.out.printf(" str1.equals(str4)  %b%n", str1.equals(str4));
		System.out.printf(" str3.equals(str4)  %b%n", str3.equals(str4));
		
		
		
		str1+="world"; 			//new로 생성됨 
		str3+="world"; 			//new로 생성됨 
		System.out.printf(" str1==str2  %b%n", str1==str2);
		
		
		System.out.println(str1.replace('h', 'k'));
		System.out.println(str1);
		System.out.println(str1.length());			//함수를 이용해서 문자열 길이를 추출
		System.out.println(str3.hashCode());
		System.out.println(str1.hashCode());
		
	}
}












