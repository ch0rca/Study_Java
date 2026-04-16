package chapter06;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate today = new MyDate(2017,13,32);
		today.setDate(2026,4,8);
		System.out.println(today.toString());
		
		System.out.println(today);
//		today.year = 2026;
//		today.month= 13;
//		today.date = 32;
		
		
//		MyDate d1 = new MyDate(2017,13,32);
//		d1.year = 2019;
//		d1.month= 13;
//		d1.date = 32;
//		System.out.println(d1.toString());
//		System.out.println(d1);
//		d1.setDate(2019, 7, 15);
//		System.out.println(d1);
	}
}









