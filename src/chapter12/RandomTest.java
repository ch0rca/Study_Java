package chapter12;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int n = 6;

        int[] selectNumber = new int[n];
        // 🔹 seed=3 고정: 항상 동일한 순서로 난수 발생 → 재현 가능
        // 💡 Math.random()과 달리 seed를 지정하면 테스트 시 동일 결과를 보장
        Random random = new Random(3);
        System.out.print("선택 번호: ");
        for (int i = 0; i < n; i++) {
            // 🔹 nextInt(45): 0~44 범위 정수 → +1 → 1~45 (로또 번호 범위)
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        int[] winningNumber = new int[n];
        random = new Random(5);  // 🔹 seed=5 → 선택번호와 다른 난수 순서
        System.out.print("당첨 번호: ");
        for (int i = 0; i < n; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        // 🔹 Arrays.sort(): 배열을 오름차순 정렬
        //    순서에 상관없이 같은 숫자들인지 비교하기 위해 정렬 먼저
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);

        // 🔹 Arrays.equals(): 배열 내용이 같은지 비교
        //    배열을 == 으로 비교하면 참조(주소) 비교 → 항상 false
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.print("당첨 여부: ");
        if (result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}