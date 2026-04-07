package chapter04;

import java.util.Scanner;

/** 직삼각형 출력하기 */
public class ForTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num < 1) {
			System.out.println("1이상의 정수를 입력하세요");
		}else {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for (int i = num; i >=1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
	}
}
