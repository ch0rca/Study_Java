package chapter12;

public class MathTest {
	public static void main(String[] args) {
		//큰 정수 또는 작은 정수 얻기
		double v1 = Math.ceil(5.3);
		double v2 = Math.floor(5.3);
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		
		//큰값 또는 작은값 얻기
		long v3 = Math.max(3, 7);
		long v4 = Math.min(3, 7);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		
		//소수 이하 두자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v5 = temp2 / 100.0;
		System.out.println("v5=" + v5);
		
		/*
		 * Math.random()  : 0이상 1미만의 난수를 발생 시킨다. 
		 *  => seed 값이 현재 시간  
		 */
		//0이상 50미만 난수 발생 
		System.out.println((int)(Math.random()*50));
		//0이상 50이하의 난수 발생 
		System.out.println((int)(Math.random()*51));
		
	}
}

