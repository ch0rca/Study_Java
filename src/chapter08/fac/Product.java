package chapter08.fac;

// 🔹 추상 클래스: 직접 생성 불가, 공통 기능(power, isOn) 제공
public abstract class Product {
    private boolean isOn;

    // 🔹 추상 메서드: 각 제품(Phone, SmartPhone)이 반드시 자신만의 방식으로 구현
    public abstract void service(Command command);

    // 🔹 power(): 토글 방식 — 켜져 있으면 끄고, 꺼져 있으면 켬
    public void power()    { isOn = !isOn; }
    public boolean isOn()  { return isOn; }
}