package chapter05;

import java.util.Arrays;

public class PassByValue2 {

    // 🔹 System.arraycopy와 동일한 기능을 직접 구현한 메서드
    // 🔹 매개변수: src(원본배열), o1(원본 시작인덱스), copy(대상배열), o2(대상 시작인덱스), len(복사 개수)
    public static void arrayCopy(int[] src, int o1, int[] copy, int o2, int len) {

        // 🔹 유효성 검사 1: 원본 배열에서 꺼낼 범위가 배열 크기를 초과하는지 확인
        // 💡 o1+len이 src.length보다 크면 인덱스 초과 → 미리 막아줌
        if (src.length < o1 + len) {
            System.err.println("복사할 시작 위치와 개수가 맞지 않습니다.");
            return;     // 🔹 메서드 즉시 종료 (void 메서드에서의 return)
        }

        // 🔹 유효성 검사 2: 복사 대상 배열에 받을 공간이 충분한지 확인
        if (copy.length < o2 + len) {
            System.err.println("복사할 시작 위치와 개수가 맞지 않습니다.");
            return;
        }

        // 🔹 o1부터 o1+len 직전까지 순회하며 복사
        // 🔹 o2++: copy 배열에 한 칸씩 이동하며 저장 (후위증가로 저장 후 인덱스 증가)
        for (int i = o1, end = o1 + len; i < end; i++) {
            copy[o2++] = src[i];
        }
        // 💡 참조형 배열이 전달되므로 copy 배열의 실제 데이터가 변경됨 (PassByValue 원리)
    }

    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] copy   = new int[3];

        // 🔹 array1의 0번부터 3개를 copy의 0번부터 복사
        arrayCopy(array1, 0, copy, 0, 3);
        System.out.println(Arrays.toString(copy));  // 🖨️ [0, 1, 2]
    }
}