package chapter12;

/**
 * Record : 
 *  - DTO (Data Transfer Object)를 간략하게 작성하기
 *  - getter, toString(), equals(), hashCode()를 자동으로 Generation
 *  - 형식]
 *  public record 이름([인자리스트]){}
 */
public class RecodeTest {
    public static void main(String[] args) {
        // 🔹 record는 생성자 파라미터 그대로 불변(immutable) 객체 생성
        // 💡 setter 없음 — 생성 후 값 변경 불가, 데이터 무결성 보장
        MyRecord r1 = new MyRecord("ureca", 4, "코딩");
        MyRecord r2 = new MyRecord("ureca", 4, "코딩");

        // 🔹 getter: getName() 아닌 필드명() 형태로 자동 생성됨
        System.out.println(r1.name());   // 🖨️ ureca
        System.out.println(r1.age());    // 🖨️ 4
        System.out.println(r2.hobby());  // 🖨️ 코딩

        // 🔹 toString() 자동 생성: MyRecord[name=ureca, age=4, hobby=코딩] 형태
        System.out.println("r1:" + r1);

        // 🔹 equals() 자동 생성: 모든 필드 값이 같으면 true
        // 💡 일반 클래스는 equals()를 직접 오버라이딩해야 하지만 record는 자동
        System.out.println(r1.equals(r2));  // 🖨️ true

        // 🔹 hashCode() 자동 생성: 같은 값이면 같은 해시코드
        System.out.println("r1.hashCode:" + r1.hashCode());
        System.out.println("r2.hashCode:" + r2.hashCode());
        // 🖨️ r1, r2의 hashCode 동일 (내용이 같으므로)
    }

    // 🔹 record 선언: 클래스 내부에 선언 가능 (중첩 record)
    // 🔹 컴파일러가 자동으로 private final 필드, 생성자, getter, equals, hashCode, toString 생성
    public record MyRecord(String name, Integer age, String hobby) {}
}