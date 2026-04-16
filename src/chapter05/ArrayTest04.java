package chapter05;

import java.util.Arrays;

public class ArrayTest04 {
    public static void main(String[] args) {

        /* - 배열 크기는 변경 불가 이므로 크기 변경을 하고 싶다면 
         *   새로 생성해서 복사해야 한다. 
         *  System.arraycopy(src, srcPos, dest, destPos, length);  
         *  src: 복사할 원본 
         *  srcPos: 복사할 위치 
         *  dest: 부본(카피본)
         *  destPos: 부본에 복사될 위치
         *  length : 복사할 데이타 개수 
         */
        int[] src   = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] copy1 = new int[15];      // 🔹 원본(8칸)보다 큰 15칸 — 나머지는 0으로 채워짐
        int[] copy2 = new int[3];       // 🔹 부분 복사용 3칸

        // 🔹 전체 복사: src의 0번 인덱스부터 src.length(8)개를 copy1의 0번부터 복사
        System.arraycopy(src, 0, copy1, 0, src.length);
        System.out.println(Arrays.toString(copy1));
        // 🖨️ [0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0, 0, 0, 0]

        // 🔹 부분 복사: src의 2번 인덱스부터 3개(copy2.length)를 copy2의 0번부터 복사
        System.arraycopy(src, 2, copy2, 0, copy2.length);
        System.out.println(Arrays.toString(copy2));
        // 🖨️ [2, 3, 4]

        /*
         * Arrays.copyOf(original, newLength)
         * original : 복사할 원본
         * newLength: 배열의 새로운 크기 
         *  - 배열을 새로운 크기로 생성해서 원본을 복사해서 리턴 
         */
        // 🔹 src.length+5 = 13칸짜리 새 배열 생성 후 src 전체 복사, 나머지는 0
        // 💡 System.arraycopy와 달리 새 배열을 직접 만들어 반환 — 원본 변경 없음
        System.out.println(Arrays.toString(Arrays.copyOf(src, src.length + 5)));
        // 🖨️ [0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 0, 0, 0]

        /*
         *  Arrays.copyOfRange(original, from, to)
         *  original : 복사할 원본
         *  from : 복사할 시작 위치 
         *  to : 복사할 마지막 위치
         *  from위치 부터 to위치까지 복사해서 리턴(부분복사)
         */
        // 🔹 인덱스 1번부터 3번 직전(=2번)까지 복사 → to는 포함하지 않음(exclusive)
        System.out.println(Arrays.toString(Arrays.copyOfRange(src, 1, 3)));
        // 🖨️ [1, 2]
    }
}