package chapter05;

import java.util.Arrays;

/**
 * - 자바는 변수에 값을 대입할때 메서드의 인자를 전달할 때, 메서드의 값을 리턴할 때 
 *   Pass By Value 방식 하나만 사용 
 *   
 *   Pass By Value  : 전달할 때 변수에 저장된 값을 전달 
 *   자바 타입
 *     - Primitive : 변수에 실제 값이 저장 됨
 *       => 전달할 때 값이 전달(Pass By Value)
 *     - Reference : 변수에 참조 값(hash code)가 저장
 *       => 전달할 때 참조 값(hash code)이 전달 (Pass By Reference)   
 */
public class PassByValueTest {

    // 🔹 기본형(int) 매개변수: 호출 시 k의 값(10)이 복사되어 a에 전달
    // 🔹 a는 k와 완전히 별개인 변수 — a를 수정해도 k에 영향 없음
    public static int passValue(int a) {
        System.out.println(a);      // 🖨️ 출력: 10
        return a + 10;              // 🔹 20을 반환, 원본 k는 여전히 10
    }

    // 🔹 참조형(int[]) 매개변수: 호출 시 array의 주소값이 복사되어 data에 전달
    // ⚠️ data와 array가 같은 Heap 주소를 가리킴 → data를 통해 수정하면 원본도 바뀜!
    public static void passReference(int[] data) {
        System.out.println(Arrays.toString(data));  // 🖨️ [0, 1, 2, 3, 4, 5]
        data[0] = 100;  // 🔹 Heap의 실제 배열 데이터를 수정 → 원본 array[0]도 100이 됨
    }

    public static void main(String[] args) {
        int k = 10;
        System.out.println(passValue(k));   // 🖨️ 20 (반환값)
        // 🔹 passValue 안에서 a를 수정해도 k는 전혀 영향을 받지 않음
        System.out.println("k:" + k);       // 🖨️ k:10 (원본 불변)

        int[] array = {0, 1, 2, 3, 4, 5};
        passReference(array);
        // ⚠️ 메서드 안에서 data[0]=100으로 바꿨으므로 원본 array[0]도 100으로 변경됨
        System.out.println(Arrays.toString(array)); // 🖨️ [100, 1, 2, 3, 4, 5]
    }
}