package chapter11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *  Declare  Exception(선언적 예외 처리)
 *  - 오류가 발생한 곳에서 예외 처리를 직접하지 않고 메서드 호출한 곳으로 
 *    예외를 던져서  메서드 호출한 곳에서 처리하도록 위임
 *  - 목적
 *    1. 오류가 발생한 곳에서 직접 처리하면 처리 방법이 고정되므로 
 *       메서드를 호출한 곳에 맞에 처리가 되지 않음
 *       => 메서드 호출한 곳에 맞게 처리하기 위해 처리 방법을 위임
 *       => 예외 처리의 다양성을 제공 
 *       
 *    2. 다양한 함수에서 여러 오류가 발생하지만 처리하는 방법이 한가지인 경우 
 *       각가의 함수에서 똑같은 예외 처리를 하면 코드 재사용이 안되므로 
 *       오류를 한곳(이벤트 처리하는 곳, 클라이언트의 요청을 받는 곳)으로 
 *       던져서 한번에 처리한다. 
 *       
 *    3. 메서드가 정상적으로 처리된 경우  결과를 return을 통해 전달하고 
 *       메서드에 문제가 발생한 경우 예외를 통해 호출한 곳으로 전달.
 *      
 *  - 형식]
 *  [modifiers] 리턴타입  메서드이름([인자들,...])[throws 예외들, ....]{
 *  	//오류가 발생된 코드
 *  }
 *  
 *  예외 던지기] 
 *  throw 예외객체;
 */

class MyUtil{
	public static void load(String fileName) throws FileNotFoundException {
		
	}
}
public class ExcepTest3 {
	public static void main(String[] args) {
//		System.out.println(MyUtil.mod(256, 4));
//		try {
//			System.out.println(MyUtil.mod(256, 0));
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			MyUtil.load("a.txt");
//		} catch (FileNotFoundException e) {
////			e.printStackTrace();   //발생한 오류 정보와 위치를 모두 출력
//			System.out.println(e.getMessage());	//발생한 오류 메세지만 추출 
//		}
//		
//		try {
//			MyUtil.load("src/chapter0/ExcepTest3.java");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
			
		System.out.println("main end");
	}
}












