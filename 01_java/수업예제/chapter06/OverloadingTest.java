package chapter06;

/*
 * Method Overloading
 *  - 동일한 기능의 함수가 인자가 달라서 여러개의 함수를 선언해야 할 때 
 *    이름을 동일하게 선언한다. 
 *    
 *  - 인자로 메서드를 구별한다. 
 *    인자의 개수, 인자의 타입, 순서가 달라야 한다.  
 *    
 *  ==> 호출할때 편하게 사용하기 위해서   Method Overloading 기술을 사용한다. \
 *  ==> 유지보수 성을 높여준다.  
 * 
 */

class MyMath{
	public int plus(int a, int b) {
		return a+b;
	}
	public double plus(double a, double b) {
		return a+b;
	}
}


public class OverloadingTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		System.out.println(mm.plus(256.5, 4.0));
	}
}
