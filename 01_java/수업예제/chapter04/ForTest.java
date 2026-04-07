package chapter04;

public class ForTest {
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		int [] a = new int[10];
		for (int i = 0, size = a.length; i < size; i++) {
			System.out.println(a[i]);
		}
		/*
		 * for~each : 배열 or 컬렉션을 처음부터 끝까지 반복해서 추출한 데이타를 
		 *            변수에 저장 
		 * for( 데이타타입 변수명 :  배열 or 컬렉션){
		 * 
		 * }
		 */
		for (int i : a) {
			System.out.println(i);
		}
	}
}







