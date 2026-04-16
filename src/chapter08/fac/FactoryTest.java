package chapter08.fac;

public class FactoryTest {
    public static void main(String[] args) {
        // 🔹 Product 타입으로 받기 → Phone인지 SmartPhone인지 전혀 몰라도 됨
        Product p = ProductFactory.getInstance();
        p.power();  // 🔹 전원 ON

        // 🔹 Virtual Invocation: p가 실제로 SmartPhone이면 SmartPhone.service() 호출
        p.service(PhoneCommand.CALL);

        Product p2 = ProductFactory.getInstance();
        p2.power();
        p2.service(PhoneCommand.PHONE_LIST);

        // 💡 ProductFactory.getInstance()에서 return new Phone()으로 바꾸면
        //    이 코드 수정 없이 전부 Phone.service()로 전환됨 — OCP 원칙
        System.out.println("main end");
    }
}