package chapter04;

/**
 *	메서드 
 *  - 코드 재사용의 최소 단위  
 *  - 선언 
 *    [modifiers] 리턴타입 메소드명([인자, ...]){
 *    
 *    	[return  값]
 *    }
 *  - 호출]
 *      메서드명([인자 값, ...]);  
 *    
 * modifiers
 *   -access modifier(접근제한자) : public protected 생략	private 
 *   -usage modifier(기능제한자)  : static, final, abstract  
 */

public class MethodTest1 {

    // 🔹 메서드 선언 분해:
    //    public  → 접근제한자: 어디서든 호출 가능
    //    static  → 객체 생성 없이 클래스 이름으로 바로 호출 가능
    //    int     → 리턴타입: 이 메서드는 int 값을 반드시 반환해야 함
    //    plus    → 메서드명
    //    (int i, int j) → 매개변수(parameter): 호출 시 전달받을 값의 타입과 이름
    public static int plus(int i, int j) {
        // 🔹 return: 메서드 실행 결과를 호출한 곳으로 돌려주고 메서드 종료
        // 🔹 리턴타입이 int이므로 반드시 int 값을 return해야 함
        return i+j;
    }

    public static void main(String[] args) {
        // 🔹 메서드 호출: plus(256, 128)
        //    256 → i에, 128 → j에 대입 (인수(argument)가 매개변수(parameter)에 복사됨)
        // 🔹 plus가 static이므로 객체 없이 메서드명만으로 호출 가능
        // 💡 main도 static이기 때문에, static 메서드끼리는 바로 호출할 수 있음
        System.out.println( plus(256, 128));    // 🖨️ 출력: 384
    }
}