package chapter04;

import java.util.Scanner;

/** 직삼각형 출력하기 */
public class ForTest2 {
    public static void main(String[] args) {

        // 🔹 Scanner: 표준 입력(키보드)으로부터 값을 읽어들이는 클래스
        // 🔹 System.in: 키보드 입력 스트림
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();   // 🔹 정수 하나를 입력받아 num에 저장

        if(num < 1) {
            // ⚠️ 1 미만 입력 시 안내 메시지 출력 후 프로그램 종료
            System.out.println("1이상의 정수를 입력하세요");
        }else {
            // 🔹 이중 for문 — 바깥 for: 행(row) 제어, 안쪽 for: 열(column) 제어

            // 🔹 [위쪽 삼각형] i가 늘어날수록 j의 최대값도 커짐 → 별이 1개씩 증가
            // 예: num=3이면 → * / * * / * * *
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");     // 🔹 print: 줄바꿈 없이 출력
                }
                System.out.println();           // 🔹 한 행이 끝난 뒤 줄바꿈
            }

            // 🔹 [아래쪽 삼각형] i가 줄어들수록 j의 최대값도 작아짐 → 별이 1개씩 감소
            // 예: num=3이면 → * * * / * * / *
            for (int i = num; i >=1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            // 💡 두 삼각형을 합치면 마름모(다이아몬드) 모양이 됨
        }
    }
}