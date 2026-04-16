package chapter13;

class Box<T> {
    private T t;

    // 🔹 Getter/Setter 리턴·파라미터 타입이 T → 사용 시점에 결정
    public T get()       { return t; }
    public void set(T t) { this.t = t; }
}

/**
 * 제네릭 메소드
 * 파라미터를 제네릭으로 선언하는 메서드 
 * 형식]
 * [modifier] <타입파라미터> 리턴타입 함수명(타입매개변수,...){} 
 */
public class GenericTest2 {

    // 🔹 <T>: 메서드 단위 타입 파라미터 선언 — 리턴타입 앞에 위치
    // 🔹 호출 시 전달 인자의 타입을 보고 T를 자동으로 추론
    // 💡 클래스 전체가 아닌 이 메서드에서만 T를 사용할 때 이 방식을 씀
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();  // 🔹 Box의 T도 같은 T로 연결됨
        box.set(t);
        return box;
    }

    public static void main(String[] args) {

        // 🔹 boxing(100): 인자가 int → 오토박싱으로 Integer → T = Integer 자동 추론
        Box<Integer> box1 = boxing(100);
        // 🔹 box1.get() 리턴 타입 = Integer → 오토언박싱으로 int로 받기 가능
        int intValue = box1.get();
        System.out.println(intValue);   // 🖨️ 100

        // 🔹 boxing("홍길동"): 인자가 String → T = String 자동 추론
        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);   // 🖨️ 홍길동
    }
}