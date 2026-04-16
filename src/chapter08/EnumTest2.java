package chapter08;

// 🔹 enum에 속성, 생성자, 메서드를 추가하면 각 상수에 부가 정보를 담을 수 있음
enum Season {
    // 🔹 각 상수 선언 시 생성자 인자를 ()로 전달
    SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");

    private String season;

    // 🔹 enum 생성자는 반드시 private — 외부에서 new Season() 생성 불가
    // 💡 각 상수(SPRING, SUMMER...)가 선언될 때 이 생성자가 한 번씩 자동 호출됨
    private Season(String season) {
        this.season = season;
    }

    public String getSeason() { return season; }
}

public class EnumTest2 {
    public static void main(String[] args) {
        Season s = Season.SUMMER;

        System.out.println(s.getSeason()); // 🖨️ "여름" — 생성자로 설정한 한글 이름
        System.out.println(s.name());      // 🖨️ "SUMMER" — 상수 선언 이름 (Enum 기본 제공)
        System.out.println(s.ordinal());   // 🖨️ 1 — 선언 순서(0부터, SPRING=0, SUMMER=1...)
    }
}