package chapter05;

import java.util.Arrays;

/**
 * 다차원 
 * 선언과 생성시 []가 차원을 의미  
 * 할당시에는 { }가 차원을 의미
 */
public class ArrayTest03 {
    public static void main(String[] args) {

        // 🔹 2차원 배열: 행(row) 2개, 열(column) 3개 → 총 6칸
        // 🔹 a1.length = 2 (행 수), a1[i].length = 3 (각 행의 열 수)
        int[][] a1 = new int[2][3];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.printf("a1[%d][%d]:%d ", i, j, a1[i][j]);
                // 🖨️ 출력: a1[0][0]:0 a1[0][1]:0 ... (모두 기본값 0)
            }
            System.out.println();
        }

//      행마다 다른 열의 크기로 배열 생성 
        // 🔹 가변 배열(Jagged Array): 열 크기를 행마다 다르게 지정 가능
        // 💡 Java의 2차원 배열은 "배열의 배열" 구조이기 때문에 가능
        int[][] a2 = new int[3][];      // 🔹 행은 3개, 각 행의 열은 아직 미결정
        a2[0] = new int[5];             // 🔹 0번 행: 5칸
        a2[1] = new int[1];             // 🔹 1번 행: 1칸
        a2[2] = new int[10];            // 🔹 2번 행: 10칸
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                System.out.printf("a2[%d][%d]:%d ", i, j, a2[i][j]);
            }
            System.out.println();
        }

//              열     0번  1번  2번
        // 🔹 중괄호 중첩으로 2차원 배열 선언+생성+초기화 동시에
        int[][] a3 = {{0, 1, 2},        //0번행
                      {3, 4, 5},        //1번행
                      {6, 7, 8}};       //2번행

        // 🔹 a3[i] 는 i번째 행 배열 자체 → Arrays.toString()으로 한 행씩 출력
        for (int i = 0; i < a3.length; i++) {
            System.out.println(Arrays.toString(a3[i]));
            // 🖨️ [0, 1, 2] / [3, 4, 5] / [6, 7, 8]
        }

        // 🔹 3차원 배열: {} 3겹 중첩
        // 🔹 a4[0][0] = {0}, a4[0][1] = {1,2}, a4[1][0] = {3,4,5}
        // 💡 실무에서 3차원 이상은 거의 사용하지 않음 — 구조 이해용
        int[][][] a4 = {{{0}, {1, 2}},
                        {{3, 4, 5}}};
    }
}