package chapter11;


/**
 * 사용자 정의 Exception 
 * UnCheckedException 
 *  - 예외 처리하지 않아도 컴파일 error가 발생하지 않음 
 *    => 실행시에 오류가 발생할 수 있다. 
 *  - 종류 
 *    RuntimeException과  RuntimeException을 상속 받은 sub들
 *  - 사용자 정의  UnCheckedException 
 *    RuntimeException과  RuntimeException을 상속 받은 sub들을 상속 받는다. 
 *    ex)RuntimeException
 *    
 * CheckedException 
 *  - 예외 처리하지 않으면 컴파일 error가 발생한다. 
 *    => 반드시 예외 처리해야 한다.  
 *  - 종류 
 *    RuntimeException과  RuntimeException을 상속 받은 sub들을 제외한 나머지 예외들
 *    ex)Exception, IOException 
 *  - 사용자 정의  CheckedException 
 *    RuntimeException과  RuntimeException을 상속 받은 sub들을 제외한 예외들을 상속 받는다. 
 *    ex)Exception  
 */

class MyChecked extends Exception{
	public MyChecked() {
		super("사용자 정의 Checked Exception이 발생했습니다.");
	}
	public MyChecked(String msg) {
		super(msg);
	}
}

class MyUnChecked extends RuntimeException{
	public MyUnChecked() {
		super("사용자 정의 UnChecked Exception이 발생했습니다.");
	}
	public MyUnChecked(String msg) {
		super(msg);
	}
}

class ExceptionUse{
	public static int mod(int i, int j) throws MyChecked {
		if(j ==0) {
			throw new MyChecked("0으로 나눌수 없습니다. 두번째 인자를 0이 아닌 정수로 입력해주세요");
		}else {
			return i/j;
		}
	}
	public static int div(int i, int j)  {
		if(j ==0) {
			//MyUnChecked는 RuntimeException을 상속 받아서 예외처리 하지 않아도 
			//컴파일 에러가 발생하지 않는다. 
			throw new MyUnChecked("0으로 나눌수 없습니다. 두번째 인자를 0이 아닌 정수로 입력해주세요");
		}else {
			return i/j;
		}
	}
}

public class ExcepTest5 {
	public static void main(String[] args) {
		
		try {
			ExceptionUse.mod(256, 4);   //Checked Exception을 던진 함수를 호출할때는 반드시 예외 처리 해야 한다. 
		} catch (MyChecked e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExceptionUse.div(256,4);		//UnChecked Exception을 던진 함수를 호출할때는 필요하면 예외 처리 해야 한다.
	}
}





