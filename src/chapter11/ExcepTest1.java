package chapter11;

/*
 * try~catch   : 오류가 발생한 곳에서 직접 처리 
 *   형식]
 *   try{
 *      //오류가 발생될 코드 
 *   }catch(예외클래스 인자명){
 *      //예외 처리
 *   }catch(예외클래스 인자명 || 예외클래스 인자명 ...){
 *      //예외 처리
 *   }finally{
 *      //try문이 수행되면 항상 수행되는 문장 
 *      ex) 자원반납 (File, Network, DB)
 *   }
 */
public class ExcepTest1 {
    public static void main(String[] args) {
        String[] greeting = {"hello", "hi", "안녕하세요"};

        try {
            // 🔹 배열 크기는 3(인덱스 0~2)인데 i<4로 반복 → i=3에서 범위 초과
            for (int i = 0; i < 4; i++) {
                System.out.println(greeting[i]);
            }
            // ⚠️ i=3 시점에서 ArrayIndexOutOfBoundsException 발생
            //    → 이후 코드는 실행 안 되고 즉시 catch로 이동
        } catch (Exception e) {
            // 🔹 Exception은 모든 예외의 부모 → ArrayIndexOutOfBoundsException도 잡힘
            // 🔹 getMessage(): 예외 메시지만 반환 (e.printStackTrace()는 전체 스택 출력)
            System.out.println(e.getMessage());
            // 🖨️ Index 3 out of bounds for length 3
        }

        // 🔹 예외 처리 후 프로그램이 정상적으로 계속 실행됨
        System.out.println("main end");  // 🖨️ main end
    }
}