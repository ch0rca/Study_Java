package chapter13;

/**
 * 제한된 제네릭(Bounded Generic)
 * 
 *  <T extends 제한타입>
 *   - extends 키워드를 사용하여 사용할 수 있는 타입의 상한을 정해놓는 것
 *   - 제한 타입을 포함한 하위 타입만 사용 가능 
 *   클래스 : class 이름  <T extends 제한타입>{}
 *   메서드 : public <T extends 제한타입> 리턴타입 메서드명(인자,..)
 */
class Home <T extends Number>{
	T roomNumber;
}
public class GenericTest3 {
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + 
										t2.getClass().getSimpleName() + ")");
		//Number의 메소드 사용
		double v1 = t1.doubleValue(); 
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	public static void main(String[] args) {
		//제네릭 메소드 호출
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println();

		//제네릭 메소드 호출
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
//		System.out.println(compare("4.5", "4.5"));
	}
}
