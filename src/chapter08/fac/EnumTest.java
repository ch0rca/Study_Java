// chapter08.fac.EnumTest.java
package chapter08.fac;

public class EnumTest {
    public static void main(String[] args) {
        // 🔹 enum은 Enum 클래스를 자동 상속 → 다른 클래스는 extends 불가
        // 🔹 하지만 interface는 implements 가능 → Command 타입으로 다형성 활용
        // 💡 PhoneCommand.CALL을 Command 타입으로 받아 처리 가능
        Command command = PhoneCommand.CALL;
        // 🔹 TVCommand도 Command 구현체 → 같은 Command 타입 변수에 담을 수 있음
    }
}