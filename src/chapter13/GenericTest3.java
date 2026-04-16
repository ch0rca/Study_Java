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

//🔹 Home의 T는 Number 또는 Number의 자식(Integer, Double, Long 등)만 가능
//⚠️ 인터페이스를 상한으로 설정할 때도 implements가 아닌 extends 사용
class Home<T extends Number> {
 T roomNumber;
}

public class GenericTest3 {

 // 🔹 <T extends Number>: T는 Number 계열만 허용
 // 💡 이 덕분에 메서드 내부에서 Number의 메서드(doubleValue 등)를 안심하고 호출 가능
 //    만약 <T>만 쓰면 T가 어떤 타입인지 모르니 doubleValue() 호출 불가 → 컴파일 에러
 public static <T extends Number> boolean compare(T t1, T t2) {
     // 🔹 getClass().getSimpleName(): 실제 런타임 타입 이름 반환
     System.out.println("compare(" + t1.getClass().getSimpleName() + ", "
                                   + t2.getClass().getSimpleName() + ")");

     // 🔹 Number의 메서드 — T가 Number 계열임이 보장되므로 호출 가능
     //    Integer든 Double이든 모두 doubleValue()로 통일해서 비교
     double v1 = t1.doubleValue();
     double v2 = t2.doubleValue();
     return (v1 == v2);
 }

 public static void main(String[] args) {

     // 🔹 10, 20 → 오토박싱으로 Integer → T = Integer 추론
     boolean result1 = compare(10, 20);
     // 🖨️ compare(Integer, Integer)
     System.out.println(result1);  // 🖨️ false
     System.out.println();

     // 🔹 4.5, 4.5 → Double → T = Double 추론
     boolean result2 = compare(4.5, 4.5);
     // 🖨️ compare(Double, Double)
     System.out.println(result2);  // 🖨️ true

//   System.out.println(compare("4.5", "4.5"));
     // ❌ 컴파일 에러 — String은 Number 계열이 아님
     //    제한된 제네릭 덕분에 잘못된 타입 사용을 컴파일 시점에 차단
 }
}