package chapter11;

public class ExcepTest2 {

	public static void main(String[] args) {

		int result = 0;
		try {
			result = 256/ Integer.parseInt(args[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("데이타를 입력해 주세요 ");
		//}catch(NumberFormatException e) {
		//	System.out.println("정수를 입력해 주세요 ");
		}catch(ArithmeticException e) {
			System.out.println("0이 아닌 정수를 입력해 주세요 ");
			return;
		//}catch(Exception e) {
		//	System.err.println("잘못 입력했습니다. 다시 입력하세요");
		}finally {
			System.out.println("finally 문장이 수행됐습니다.......");
			/*
			 * 항상 수행되는 문장 => 꼭 수행해야 하는 기능을 작성 ex) IO close, Network 종료... 
			 * 1. try문에서 오류가 발생하지 않아도 
			 * 2. try문에서 오류가 발생한 경우에도
			 * 3. 오류가 발생했지만 처리가 안된 경우에도 
			 * 4. try문이나 catch문에 return된 경우에도 
			 * 
			 * 단, System.exit(~)에 의해 JVM을 종료하면 finally문은 수행되지 않음.
			 * 
			 * 
			 */
		}
		System.out.printf("결과 : %d\n", result);
	}
}













