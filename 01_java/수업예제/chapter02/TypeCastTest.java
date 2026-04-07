package chapter02;

/**
 * 자동으로 형변화환 되는 경우 
 * byte => short  => int => long => float => double
 *         char 
 *
 * - casting 
 *   명시적으로 형변환 
 * (변환할타입)값;
 * 
 */
public class TypeCastTest {
	public static void main(String[] args) {
		byte b1 = 3, b2=5;
		byte b3 = (byte)(b1+b2);
		
		long l1 = 2222222222L;
		
		float f1 = l1;
		System.out.println("f1:"+f1);
		
		long l2 = (long)f1;
		System.out.println("l2:"+l2);
	}
}





