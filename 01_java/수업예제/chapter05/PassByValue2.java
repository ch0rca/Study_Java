package chapter05;

import java.util.Arrays;

public class PassByValue2 {
	public static void arrayCopy(int[] src, int o1, int[] copy, int o2, int len) {
		if(src.length< o1+len) {
			System.err.println("복사할 시작 위치와 개수가 맞지 않습니다.");
			return;
		}
		if(copy.length< o2+len) {
			System.err.println("복사할 시작 위치와 개수가 맞지 않습니다.");
			return;
		}
		for (int i = o1, end = o1+len; i <end; i++) {
			copy[o2++] = src[i];
		}
	}
	public static void main(String[] args) {
		int []  array1 = {0,1,2,3,4,5,6,7};
		
		int[] copy= new int[3];
		arrayCopy(array1, 0, copy, 0, 3);
		System.out.println(Arrays.toString(copy));
	}
}
