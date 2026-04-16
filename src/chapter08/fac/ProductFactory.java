package chapter08.fac;

public class ProductFactory {
    // 🔹 팩토리 패턴 핵심: 객체 생성 로직을 이 한 곳에만 집중
    // 💡 Phone → SmartPhone 교체 시 이 한 줄만 수정하면 됨
    // 🔹 리턴 타입을 Product(추상 클래스)로 선언 → 다형성으로 어떤 자식도 반환 가능
    public static Product getInstance() {
//      return new Phone();
        return new SmartPhone();
    }
}