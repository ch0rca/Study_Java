package chapter08;

import java.io.Serializable;

import chapter08.sub.Trans;

/**
 * interface 
 * - 상수와 추상 메서드로만 구성되어 있다. 
 *   => 딱시 선언하지 않아도 속성은 public static final로 선언이 되고 
 *      메서드는 public abstract으로 선언된다.
 *       
 * - 다중 상속이 됨.   => 다형성을 위해 다중 상속이 됨.  
 * 선언] 
 *    [public] interface 인터페이스명 [extends super인터페이스명1, ....]{ }
 *    
 * 구현]
 *    [modifiers] class 클래스명 [extends super클래스]
 *      					   [implements super인터페이스명1, ....]{ 
 *      
 *    }
 *    
 *    
 *  - Coupling 
 *  - Coheison
 *      프로그램의 한 요소가 기능을 수행하기 위해 얼마만큼의 연관된 책임과 아이디어가 뭉쳐있는지를 나타내는 정도 
 *      일반적으로 프로그램의 한 요소가 특정 목정을 위해 밀접하게 연관된 기능들이 모여서 구현되어 있고,
 *      지나치게 많은 일을 하지 않으면 그것을 응집도가 높다고 표현.
 *
 *      ==> interface를 통해 책임을 확인할 수 있다. 
 *    
 */

//🔹 interface도 extends로 다른 인터페이스를 다중 상속 가능
interface Flyer extends Cloneable, Trans {
 int INIT = 3;   // 🔹 public static final 자동 적용
 void fly();     // 🔹 public abstract 자동 적용

 // 🔹 Java 9+: 인터페이스에 private 메서드 가능 — default/static 메서드에서 공통 로직 추출용
 private void test() {
     System.out.println("interface의 private 함수");
 }

 // 🔹 default 메서드: 구현부 포함 가능 — 구현 클래스가 선택적으로 오버라이딩 가능
 // 💡 인터페이스에 새 메서드를 추가해도 기존 구현체를 수정하지 않아도 되는 장점
 public default void defaultMethod() {
     test();  // private 메서드 호출 가능
     System.out.println("interface default method");
 }

 // 🔹 static 메서드: 인터페이스명.메서드() 로 호출 — 오버라이딩 불가
 // ⚠️ static에서는 private 메서드, default 메서드 접근 불가 (인스턴스 컨텍스트 없음)
 public static void staticMethod() {
     System.out.println(INIT);
 }
}

class Human {
 String name;
 public void start() { System.out.println("걸어 봅시다."); }
}

//🔹 extends(단일 상속) + implements(다중 구현) 동시 가능
//🔹 SuperMan은 Human이면서, Flyer·Serializable 능력도 가짐
//⚠️ Flyer가 Trans를 상속하므로 SuperMan은 Trans의 start()·stop()도 구현해야 함
class SuperMan extends Human implements Flyer, Serializable {
 public SuperMan(String name) { this.name = name; }

 // 🔹 Flyer의 추상 메서드 구현
 public void fly() { System.out.println("하늘을 날아서 지구를 구해야지"); }

 // 🔹 Trans의 start()는 Human.start()가 있어서 자동 충족, stop()은 직접 구현
 public void stop() { System.out.println("그만 움직이고 쉬어야징!!"); }
}

public class InterfaceTest {
 public static void main(String[] args) {
     // 🔹 public static final이라 객체 없이 인터페이스명.속성명으로 접근 가능
     System.out.println(Trans.INIT);  // 🖨️ 10

//   Trans.INIT = 20;  // ❌ final이라 값 변경 불가 — 컴파일 에러

     SuperMan clark = new SuperMan("클라크");
     clark.start();   // 🔹 Human.start() 실행 ("걸어 봅시다.")
     clark.fly();     // 🔹 Flyer.fly() 실행

     // 🔹 다형성: SuperMan 객체 하나를 여러 타입으로 참조 가능
     Human h = clark;   // Human 타입으로 참조 → start()만 보임
     Trans  t = clark;  // Trans  타입으로 참조 → start()·stop()만 보임
     Flyer  f = clark;  // Flyer  타입으로 참조 → fly()·defaultMethod() 보임
 }
}





