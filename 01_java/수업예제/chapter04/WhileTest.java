package chapter04;

import java.util.Iterator;

public class WhileTest {
	public static void main(String[] args) {
		int i = 1;
		int result = 1;
		
		while( i++ <=10) {
			result *= 2;
			if(result >100) {
				break; 
			}
		}
		System.out.println("result : "+result);
		
		
		for (int j = 0; j <=20; j++) {
			if(j % 4 == 0) {
				continue;
			}
			System.out.println("j : "+j);
		}
	}
}
