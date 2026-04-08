package chapter07;


//final로 선언된 클래스를 상속 받을 수 없다.    ex) String, System
//class StringSub extends String{}

class FinalSuper{
	public final void test() {}
}
class FinalSub extends FinalSuper{
//	public final void test() {}		//final로 선언된 메서드는 Override 금지
}

/** Blank Final Variable 
 *  - final로 선언된 속성의 값을 선언시 할당하지 않고 객체 생성시 할당
 *  - 장점 : 객체마다 다른 고정 값을 사용할 수 있다. 
 *  - 규칙 
 *     모든 생성자에서 반드시 값을 할당해야 한다. 
 * */
class Blank{
	private final int serialNo;
	private static int count;
	public Blank() {
		serialNo = ++count;
	}
	public Blank(int sno) {
		serialNo = sno;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Blank.count = count;
	}
	public int getSerialNo() {
		return serialNo;
	}
//	public void setSerialNo(int sno) {
//		this.serialNo = sno;   //final로 선언한 속성은 값 변경 불가
//	}
}
public class FinalTest {
	public static void main(String[] args) {
		final double PI = 3.14;
//		PI= 3.141;    //final로 선언한 변수는 값 변경 불가 
	}
}








