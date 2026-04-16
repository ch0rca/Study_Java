package chapter04;

import java.util.Scanner;

public class SwichTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("점수를 입력해 주세요");
        int score = scan.nextInt();

        if(score<0 || score>100) {
            System.out.println("잘못 입력했습니다. 0~100점 사이로 입력하세요");
        }else {
            System.out.printf(score+"점은 ");

            // 🔹 switch문: 변수 또는 식의 값을 각 case 값과 정확히 비교
            // 🔹 score/10 으로 10의 자리 숫자만 추출 → 90~99점은 9, 80~89점은 8...
            // 💡 if문보다 범위 조건에는 약하지만 정수·문자 값 분기에는 깔끔함
            switch (score/10) {
            case 10:    // 🔹 100점 처리 (100/10 = 10)
            case 9:     // 🔹 fall-through: break 없으면 다음 case로 그대로 내려옴
                        // 💡 case 10, case 9 둘 다 같은 코드 실행 → A학점
                System.out.println("A학점입니다.");
                break;  // 🔹 break: switch 블록 탈출, 없으면 다음 case까지 실행됨
            case 8:
                System.out.println("B학점입니다.");
                break;
            case 7:
                System.out.println("C학점입니다.");
                break;
            case 6:
                System.out.println("D학점입니다.");
                break;
            default:    // 🔹 어떤 case에도 해당하지 않을 때 실행 (0~5 → F)
                System.out.println("F학점입니다.");
                break;
            }
        }
    }
}