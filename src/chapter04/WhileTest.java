package chapter04;

public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        int result = 1;

        // 🔹 while문: 조건식이 true인 동안 반복 실행
        // 🔹 i++ (후위증가): 조건 비교 먼저 → 증가 나중
        //    i=1: 1<=10 → true, result*=2 → result=2,    이후 i=2
        //    i=2: 2<=10 → true, result*=2 → result=4,    이후 i=3
        //    ...
        //    i=7: 7<=10 → true, result*=2 → result=128,  이후 i=8 → break!
        while( i++ <=10) {
            result *= 2;
            // 🔹 break: 조건을 만족하면 반복문을 즉시 탈출
            // ⚠️ break 실행 시 i++는 이미 완료된 상태 (break 전에 후위증가 처리됨)
            if(result >100) {
                break;
            }
        }
        System.out.println("result : "+result); // 🖨️ 출력: result : 128

        // 🔹 for문에서 continue 사용
        for (int j = 0; j <=20; j++) {
            // 🔹 continue: 이 아래 코드를 건너뛰고 바로 증감식(j++)으로 이동
            // 🔹 j % 4 == 0: 4의 배수인 경우 (0, 4, 8, 12, 16, 20) 출력 건너뜀
            if(j % 4 == 0) {
                continue;
            }
            // 🖨️ 출력: 1,2,3, 5,6,7, 9,10,11, 13,14,15, 17,18,19 (4의 배수 제외)
            System.out.println("j : "+j);
        }
    }
}