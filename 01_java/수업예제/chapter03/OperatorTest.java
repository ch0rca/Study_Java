package chapter03;

public class OperatorTest {
	public static void main(String[] args) {
		// >>  : sign  bit를 유지하면서 오른쪽으로 1비트 이동  2의 n승으로 나눈 효과 
		int n1 = 8;
		int n2 = -8;
		
		System.out.println(" 8 >> 1 : "+(n1 >>1));
		System.out.println(" -8 >> 1 : "+(n2 >>1));
		
		// >>> :  오른쪽으로 1비트 이동, 왼쪽에는 0이 채워진다. 
		System.out.println(" 8 >>> 1 : "+(n1 >>>1));
		System.out.println(" -8 >>> 1 : "+(n2 >>>1));
		
		
		// << :  왼쪽으로 비트 이동 , 오른쪽에는 0채워진다   2의 n승으로 곱한 효과
		System.out.println("8 << 1 : "+(n1 <<1));
		System.out.println("-8 << 1 : "+(n2 <<1));
		/*
		 *					&& 		&		||		|
		 * false false		false	false	false	false
		 * false true		false	false	true	true
		 * true	false		false	false	true	true
		 * true	 true		true	true	true	true
		 *  
		 */
		int  i = 10, j = 5;
		
		boolean result = i++>10 && j++>5;
//		boolean result = ++i>10 & ++j>5;
		double d = 5/2;
		System.out.println("d:"+d);
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println(5/2.0);
		System.out.println(5.0/2.0);
		
		byte b1 = 127;
		byte b2  = (byte)(b1+3);
		System.out.println("b2 : "+b2);
		
		/* %d : 정수      %자리수d 	 %03d	
		 * %f : 실수      %.자리수f: 실수의 소수 자리수 표현
		 * %s : 문자열	 %c : 소문자 %C : 대문자
		 * %b : 논리 
		 */
		System.out.printf("result: %b  i:%d  j:%d", result, i, j);
	}
}






