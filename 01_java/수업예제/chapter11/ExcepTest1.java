package chapter11;

/*
 * try~catch   : 오류가 발생한 곳에서 직접 처리 
 *   형식]
 *   try{
 *      //오류가 발생될 코드 
 *   }catch(예외클래스 인자명){
 *   	//예외 처리
 *   }catch(예외클래스 인자명 || 예외클래스 인자명 ...){
 *   	//예외 처리
 *   }finally{
 *   	//try문이 수행되면 항상  수행되는 문장 
 *      ex) 자원반납 (File, Network, DB)
 *   }
 *   
 */
public class ExcepTest1 {
	public static void main(String[] args) {
		String[] greeting= {"hello", "hi", "안녕하세요"};
		
		try {
			for (int i = 0; i <4; i++) {
				System.out.println(greeting[i]);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}
}






	
