package chapter05;

import java.util.Scanner;

public class Main_561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 정수 10개를 입력받아 배열에 저장
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 100 미만 중 최댓값 초기값: -1 (입력값이 0 이상이라 가정 시 안전한 시작값)
        int underMax = -1;
        // 🔹 100 이상 중 최솟값 초기값: 10001 (입력 최대가 10000이라 가정 시 안전한 시작값)
        int upMin    = 10001;

        for (int i = 0; i < 10; i++) {
            if (arr[i] >= 100) {
                // 🔹 100 이상인 값 중 최솟값 갱신
                if (upMin > arr[i])
                    upMin = arr[i];
            } else {
                // 🔹 100 미만인 값 중 최댓값 갱신
                if (underMax < arr[i])
                    underMax = arr[i];
            }
        }

        // 🔹 100 이상인 수가 하나도 없으면 upMin이 초기값(10001) 그대로 → 100으로 보정
        if (upMin == 10001)
            upMin = 100;
        // 🔹 100 미만인 수가 하나도 없으면 underMax가 초기값(-1) 그대로 → 100으로 보정
        if (underMax == -1)
            underMax = 100;

        // 🖨️ "100 미만 최댓값  100 이상 최솟값" 출력
        System.out.println(underMax + " " + upMin);
    }
}