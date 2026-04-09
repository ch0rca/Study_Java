package chapter11;

public class ExcepTest2 {

	public static void main(String[] args) {

		int result = 0;
			result = 256/ Integer.parseInt(args[0]);

			/*
			 * 항상 수행되는 문장 
			 * 1. try문에서 오류가 발생하지 않아도 
			 * 2. try문에서 오류가 발생한 경우에도
			 * 3. 오류가 발생했지만 처리가 안된 경우에도 
			 * 4. try문이나 catch문에 return된 경우에도 
			 * 
			 * 단, System.exit(~)에 의해 JVM을 종료하면 finally문은 수행되지 않음.
			 */
		System.out.printf("결과 : %d\n", result);
	}
}













