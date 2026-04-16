package chapter08;

public class SingleTonTest {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();

        // 🔹 hashCode: 기본적으로 객체의 주소 기반 값 — 같은 객체면 동일
        System.out.println(s1.hashCode());  // 🖨️ 예: 1829164700
        System.out.println(s2.hashCode());  // 🖨️ 예: 1829164700 (동일! → 같은 객체 확인)
    }
}