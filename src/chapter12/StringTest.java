package chapter12;

/**
 * String
 *  - 문자열을 표현하는 API
 *  - new 없이 객체를 생성할 수 있는 유일한 API
 *      new 없이 사용 (Literal)  => Literal Pool에 저장, 재사용됨.  interned String
 *      new 생성                 => heap에 생성이 된다. 
 */
public class StringTest {
    public static void main(String[] args) {
        // 🔹 리터럴: JVM이 String Literal Pool에서 "hello"를 찾아 재사용
        //    str1, str2 모두 풀의 같은 객체를 가리킴
        String str1 = "hello";
        String str2 = "hello";

        // 🔹 new 생성: 풀을 무시하고 Heap에 별도 객체 생성
        //    str3, str4는 서로 다른 Heap 주소
        String str3 = new String("hello");
        String str4 = new String("hello");

        // 🔹 == 은 주소(참조값) 비교
        System.out.printf("str1==str2  %b%n", str1==str2);   // 🖨️ true  — 같은 풀 객체
        System.out.printf("str1==str3  %b%n", str1==str3);   // 🖨️ false — 풀 vs Heap
        System.out.printf("str3==str4  %b%n", str3==str4);   // 🖨️ false — 서로 다른 Heap 객체

        // 🔹 equals()는 문자열 내용(값) 비교 → 항상 true
        System.out.printf("str1.equals(str4)  %b%n", str1.equals(str4)); // 🖨️ true
        System.out.printf("str3.equals(str4)  %b%n", str3.equals(str4)); // 🖨️ true

        // 🔹 String은 불변(Immutable) — += 연산 시 새 객체가 생성됨
        // 🔹 str1은 "helloworld"인 새 Heap 객체를 가리킴
        //    str2는 여전히 풀의 "hello"를 가리킴
        str1 += "world";
        str3 += "world";
        System.out.printf("str1==str2  %b%n", str1==str2);   // 🖨️ false — str1은 새 객체

        // 🔹 replace(): 원본 불변 → 변환된 새 String 반환, str1 자체는 그대로
        System.out.println(str1.replace('h', 'k'));  // 🖨️ "kelloworld"
        System.out.println(str1);                    // 🖨️ "helloworld" — 원본 불변

        System.out.println(str1.length());           // 🖨️ 10
        System.out.println(str3.hashCode());         // 🖨️ "helloworld"의 해시값
        System.out.println(str1.hashCode());         // 🖨️ 동일 (같은 내용이면 hashCode 같음)
    }
}