package chapter04;

import java.util.Scanner;

public class IFTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("점수를 입력해 주세요");
        int score = scan.nextInt();

        // 🔹 입력값 유효성 검사: 0~100 범위를 벗어나면 에러 메시지 출력
        // 🔹 || (OR 단락 평가): 앞이 true면 뒤는 실행하지 않음
        if(score<0 || score>100) {
            System.out.println("잘못 입력했습니다. 0~100점 사이로 입력하세요");
        }else {
            System.out.printf(score+"점은 ");

            // 🔹 다중 if-else if-else 구조
            // 💡 "이것이 자바다" 교재 핵심 포인트:
            //    조건식은 위에서 아래로 순서대로 검사, 하나가 true면 나머지는 건너뜀
            // ⚠️ 순서가 중요! 90 조건을 아래에 두면 80점도 먼저 걸림
            if(score >=90) {
                System.out.println("A학점입니다.");
            }else if(score >=80) {          // 🔹 여기 도달했다는 건 이미 score < 90 이 보장됨
                System.out.println("B학점입니다.");
            }else if(score >=70) {          // 🔹 score < 80 보장
                System.out.println("C학점입니다.");
            }else if(score >60) {           // ⚠️ score >= 60이 아닌 score > 60: 60점은 F
                System.out.println("D학점입니다.");
            }else{                          // 🔹 0~60점 해당
                System.out.println("F학점입니다.");
            }
        }
    }
}