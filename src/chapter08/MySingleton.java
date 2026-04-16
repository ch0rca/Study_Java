package chapter08;

/**
 * Singleton Pattern
 *  - 클래스로부터 생성된 객체가 오직 하나임으로 보장하는 패턴 
 *  - 규칙
 *    1. 해당 클래스의 타입의 속성을  static으로 선언한다. 
 *    2. 생성자를 private으로 선언한다. 
 *	  3. 해당 클래스의 객체를 전달하는 메서드를 public static으로 선언한다.  
 */
public class MySingleton {
    /*
     * 1. Thread safe하게 singleton 객체 생성하기
     *     ==> 클래스 로딩과 static 처리는 JVM이 Thread safe하게 처리함.  
     */
//  private static MySingleton instance = new MySingleton();
    // ⚠️ 위 방식: 클래스 로딩 즉시 생성 — 사용하지 않아도 메모리 선점 (Eager Loading)

    /*
     * LazyHolder
     *  - 처음 getInstance()를 호출 할때 객체를 한번 생성하는 기법
     *  - static Nested 클래스에서 singleton 객체를 생성한다.  
     */
    // 🔹 static 중첩 클래스: 처음 참조될 때 JVM이 로딩 — Lazy Loading 효과
    // 💡 LazyHolder는 getInstance()가 최초 호출될 때까지 로딩되지 않음
    private static class LazyHolder {
        // 🔹 final: 한 번 생성 후 절대 변경 불가 → 불변성 보장
        private static final MySingleton instance = new MySingleton();
    }

    // 🔹 private 생성자: 외부에서 new MySingleton() 호출 불가 — 추가 생성 원천 차단
    private MySingleton() {}

    // 🔹 public static: 객체 없이 클래스명으로 호출 가능
    // 🔹 LazyHolder.instance 최초 접근 시 LazyHolder 클래스 로딩 → 단 한 번 생성
    public static MySingleton getInstance() {
        return LazyHolder.instance;
    }
}









