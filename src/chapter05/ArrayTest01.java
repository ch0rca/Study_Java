package chapter05;

import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {

        // 🔹 배열 참조 변수 선언만 한 상태 — 아직 배열 객체가 없음 (null 상태)
        int[] a1;

//      배열 객체를 생성하면 기본값으로 초기화 된다.
//      정수: 0  실수:0.0  논리:false  문자:\u0000  참조:null
        // 🔹 new int[3]: Heap 영역에 정수 3칸짜리 배열 객체 생성
        // 🔹 a1에는 그 배열의 주소(참조값)가 저장됨
        a1 = new int[3];

        // 🔹 a1.length: 배열의 크기(3) 반환 — 배열이 가진 기본 속성(필드)
        // 🔹 인덱스는 항상 0부터 length-1까지
        for (int i = 0; i < a1.length; i++) {
            System.out.printf("a1[%d]:%d\n", i, a1[i]);
            // 🖨️ 출력: a1[0]:0 / a1[1]:0 / a1[2]:0  (기본값 0)
        }

//      값 할당   변수명[index] = 값
        a1[0] = 10;
        a1[1] = 20;
        // 🔹 a1[2]는 값을 안 넣었으므로 기본값 0 유지

//      배열의 접근 범위는 0부터 length-1 까지 접근 가능 
//      범위를 벗어나면 ArrayIndexOutOfBoundsException이 발생한다. 
//      a1[3] = 30;
        // ⚠️ 인덱스 3은 크기 3짜리 배열의 범위(0~2) 초과 → 런타임 예외 발생!

        // 🔹 Arrays.toString(): 배열 내용을 "[10, 20, 0]" 형태의 문자열로 변환
        // 💡 배열을 그냥 println하면 주소값이 출력됨 — 반드시 Arrays.toString() 사용
        System.out.println(Arrays.toString(a1));    // 🖨️ [10, 20, 0]

//      선언과 생성을 동시에 
        int[] a2 = new int[2];
        System.out.println(Arrays.toString(a2));    // 🖨️ [0, 0]

//      선언과 생성과 할당을 동시에
        // 🔹 배열 초기화 리터럴: {}안에 값을 직접 나열, 크기는 자동으로 결정(8개)
        // ⚠️ 이 방식은 선언과 동시에만 사용 가능 — 나중에 따로 { }로 재할당 불가
        int[] a3 = { 0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(a3));    // 🖨️ [0, 1, 2, 3, 4, 5, 6, 7]
    }
}