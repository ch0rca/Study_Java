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
 *       각각의 함수에서 똑같은 예외 처리를 하면 코드 재사용이 안되므로 
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

class MyUtil {

    // 🔹 throws Exception: Checked Exception 위임 선언
    //    → 호출한 곳(main)에서 반드시 try-catch 또는 throws로 처리해야 함
    //    → 안 하면 컴파일 에러 발생
    public static int mod(int a, int b) throws Exception {
        // 🔹 throw: 직접 예외 객체를 생성해서 던짐
        // 🔹 Exception은 Checked이므로 throws 선언 필요
        if (b == 0) throw new Exception("0으로 나눌 수 없습니다. 두번째 인자는 0이 아닌 정수를 입력해주세요");
        return a / b;
    }

    // 🔹 throws 선언 없음: ArithmeticException은 RuntimeException 계열 → Unchecked
    //    → 호출한 곳에서 처리 안 해도 컴파일 성공 (선택적 처리)
    public static int div(int a, int b) {
        if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다. 두번째 인자는 0이 아닌 정수를 입력해주세요");
        return a / b;
    }

    // 🔹 FileInputStream 생성 자체가 FileNotFoundException(Checked)을 발생시킬 수 있음
    //    → throws로 호출한 곳에 위임 (직접 처리 안 함)
    // 💡 "load는 파일을 읽는 기능만 담당, 파일 없을 때 어떻게 할지는 호출한 곳이 결정"
    public static void load(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
    }
}

public class ExcepTest3 {
    public static void main(String[] args) {

        // 🔹 mod()는 Checked Exception을 throws → 반드시 try-catch 필요
        try {
            System.out.println(MyUtil.mod(256, 4));  // 🖨️ 64
        } catch (Exception e) {
            e.printStackTrace();  // 🔹 스택 트레이스 전체 출력 (디버깅용)
        }

        try {
            System.out.println(MyUtil.mod(256, 0));  // ⚠️ b==0 → Exception 발생
        } catch (Exception e) {
            // 🔹 getMessage(): 예외 생성 시 전달한 메시지 문자열만 출력
            System.out.println(e.getMessage());
            // 🖨️ 0으로 나눌 수 없습니다. 두번째 인자는 0이 아닌 정수를 입력해주세요
        }

        // 🔹 div()는 Unchecked(ArithmeticException) → try-catch 없어도 컴파일 OK
        System.out.println(MyUtil.div(256, 4));   // 🖨️ 64

        try {
            System.out.println(MyUtil.div(256, 0));  // ⚠️ b==0 → ArithmeticException 발생
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // 🖨️ 0으로 나눌 수 없습니다. 두번째 인자는 0이 아닌 정수를 입력해주세요
        }
	
//		try {
//			MyUtil.load("a.txt");
//		} catch (FileNotFoundException e) {
////			e.printStackTrace();   //발생한 오류 정보와 위치를 모두 출력
//			System.out.println(e.getMessage());	//발생한 오류 메세지만 추출 
//		}
		
//		try {
//			MyUtil.load("src/chapter11/ExcepTest3.java");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
    }
}












