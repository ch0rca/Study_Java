package chapter04;

public class ForTest {
    public static void main(String[] args) {

        // 🔹 기본 for문 구조: for(초기화식; 조건식; 증감식)
        // 🔹 초기화식(int i=1)은 최초 1회만 실행, 조건식이 false가 되면 반복 종료
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;   // 🔹 1+2+3+...+10 = 55 누적
        }
        System.out.println(sum);    // 🖨️ 출력: 55

        // 🔹 배열 선언: int[10] → 정수 10개짜리 배열, 초기값은 모두 0
        int [] a = new int[10];

        // 🔹 for문 초기화식에서 변수 2개 동시 선언 가능 (같은 타입일 때)
        // 🔹 a.length: 배열의 길이(10)를 반환하는 배열의 기본 속성
        // 💡 size에 미리 담아두는 이유: 매 반복마다 a.length를 호출하는 비용을 줄이는 최적화 습관
        for (int i = 0, size = a.length; i < size; i++) {
            System.out.println(a[i]);   // 🖨️ 출력: 0 (10번 반복, new int[]는 기본값 0으로 초기화)
        }

        /*
         * for~each : 배열 or 컬렉션을 처음부터 끝까지 반복해서 추출한 데이타를 
         *            변수에 저장 
         * for( 데이타타입 변수명 :  배열 or 컬렉션){
         * 
         * }
         */
        // 🔹 for-each(향상된 for문): 인덱스 없이 배열 요소를 하나씩 꺼내어 i에 저장
        // ⚠️ 인덱스로 접근하거나 요소를 수정할 수 없음 — 단순 읽기 전용
        // 🔹 내부적으로 Iterator 방식으로 동작 (컬렉션도 동일하게 사용 가능)
        for (int i : a) {
            System.out.println(i);  // 🖨️ 출력: 0 (10번, 배열 처음부터 끝까지 순회)
        }
    }
}