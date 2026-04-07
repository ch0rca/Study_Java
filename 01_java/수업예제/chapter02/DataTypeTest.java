package chapter02;

public class DataTypeTest {
	public static void main(String[] args) {
		/*
		 * 정수형에서 int가 기본 타입으로 사용됨
		 * byte, short 타입은 변수로 연산시 int로 자동 변환됨.  
		 */
		byte b1 = 3, b2 = 5;
//		byte b3 = b1+b2;
		int  i1 = b1+b2;
		
		long l1 = 125;
		long l2 = 21111111111L;
		
//		float를 선언할 경우 f, F를 붙여야 한다. 
		float f1 = 3.14f,  f2=3.14F;		 
		float f3 = 65536.256f;
		System.out.println("f1: "+f1);
		System.out.println("f3: "+f3);
		
		
		double d1 = 65536.256, d2=3.14d, d3= 3.14D;
		double d4 = 1.2345678901234569890;
		System.out.println("d1:"+d1);
		System.out.println("d4:"+d4);
		
		char c1='a';
		
//		java는 논리에 true, false의 값만 저장할 수 있다. 1 or 0은 저장할 수 없다.  
		boolean bl1 =true;

	}
}












