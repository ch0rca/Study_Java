package chapter12;

public class WrapperTest {

	public static void main(String[] args) {
		/* Wrapper  : primitive 타입을 객체화 
		 * 
		 *  primitive => 객체로 
		 *     new 생성자(값);
		 *     
		 *  객체로 => primitive
		 *     객체.XXXValue();     
		 * */
		
		// 🔹 Auto Boxing: int 10000 → Integer 객체로 자동 변환
        //    컴파일러가 Integer.valueOf(10000)으로 변환해줌
        Integer iPrice = 10000;

        // 🔹 Auto Unboxing: Integer 객체 → int 기본형으로 자동 변환
        //    컴파일러가 iPrice.intValue()로 변환해줌
        int price = iPrice;

        /*
         * 문자열 데이터를 해당 포맷의 primitive로 변환
         * 래퍼클래스.parseXXX(String data) 
         * 잘못된 포맷의 데이터로 변환 시 NumberFormatException 발생한다. 
         */
		
//		int data = Integer.parseInt("256.1");  // NumberFormatException발생한다.
     // ⚠️ Integer.parseInt("256.1") → NumberFormatException 발생
        //    정수 문자열에 소수점이 있으면 변환 불가
        int data         = Integer.parseInt("256");
        double PI        = Double.parseDouble("3.14");
        boolean isEmpty  = Boolean.parseBoolean("true");
        // 💡 "true" 이외 문자열은 false로 변환됨 ("TRUE"는 true, "yes"는 false)

        System.out.println(data);     // 🖨️ 256
        System.out.println(PI);       // 🖨️ 3.14
        System.out.println(isEmpty);  // 🖨️ true
    }
}






