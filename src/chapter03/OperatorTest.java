package chapter03;

public class OperatorTest {
    public static void main(String[] args) {
        // >>  : sign  bit를 유지하면서 오른쪽으로 1비트 이동  2의 n승으로 나눈 효과 
        int n1 = 8;
        int n2 = -8;
        
        // 🔹 8의 비트: 00001000 → 오른쪽으로 1칸 → 00000100 = 4
        // 🔹 부호비트(맨 왼쪽)가 0이므로 0으로 채워짐 → 양수 유지
        System.out.println(" 8 >> 1 : "+(n1 >>1));    // 🖨️ 출력: 4
        
        // 🔹 -8의 비트: 11111000 → 오른쪽으로 1칸 → 11111100 = -4
        // 🔹 부호비트(맨 왼쪽)가 1이므로 1로 채워짐 → 음수 유지
        System.out.println(" -8 >> 1 : "+(n2 >>1));   // 🖨️ 출력: -4
        
        // >>> :  오른쪽으로 1비트 이동, 왼쪽에는 0이 채워진다. 
        // 🔹 양수 8은 >> 와 동일한 결과 (부호비트가 원래 0이라 차이 없음)
        System.out.println(" 8 >>> 1 : "+(n1 >>>1));   // 🖨️ 출력: 4
        
        // ⚠️ 음수에 >>> 사용 시 주의: 부호비트도 강제로 0으로 채워짐
        // 🔹 -8의 비트: 11111000 → 0 + 1111100 → 엄청 큰 양수가 됨
        System.out.println(" -8 >>> 1 : "+(n2 >>>1));  // 🖨️ 출력: 2147483644
        
        
        // << :  왼쪽으로 비트 이동 , 오른쪽에는 0채워진다   2의 n승으로 곱한 효과
        // 🔹 8의 비트: 00001000 → 왼쪽으로 1칸 → 00010000 = 16 (8 × 2 = 16)
        System.out.println("8 << 1 : "+(n1 <<1));    // 🖨️ 출력: 16
        // 🔹 -8도 동일하게 × 2 효과: -8 × 2 = -16
        System.out.println("-8 << 1 : "+(n2 <<1));   // 🖨️ 출력: -16
        
        /*
         *					&& 		&		||		|
         * false false		false	false	false	false
         * false true		false	false	true	true
         * true	false		false	false	true	true
         * true	 true		true	true	true	true
         *  
         */
        int  i = 10, j = 5;
        
        // 🔹 후위증가(i++): 비교 먼저 → 증가 나중
        //    → i++>10 는 10>10으로 비교 → false → i는 비교 후 11이 됨
        // ✅ &&(단락 평가): 앞이 false면 뒤는 실행 자체를 안 함!
        //    → j++>5 는 아예 실행되지 않음 → j는 5 그대로 유지
        boolean result = i++>10 && j++>5;
        
//      boolean result = ++i>10 & ++j>5;
        // 💡 위 코드로 바꾸면?
        //    전위증가(++i): i가 먼저 11이 된 후 비교 → 11>10 → true
        //    &(항상 양쪽 실행): 앞이 true여도 ++j>5 반드시 실행 → j=6, 6>5 → true
        //    → result=true, i=11, j=6

        // 🔹 정수끼리 나눗셈 → 결과도 정수 (소수점 버림)
        // ⚠️ double 변수에 담아도, 이미 5/2 연산이 int로 끝난 뒤 2.0으로 변환됨
        double d = 5/2;
        System.out.println("d:"+d);        // 🖨️ 출력: 2.0  ← 2가 2.0으로 자동 변환된 것
        System.out.println(5/2);           // 🖨️ 출력: 2    ← int / int = int
        System.out.println(5.0/2);         // 🖨️ 출력: 2.5  ← double / int → int가 double로 자동변환
        System.out.println(5/2.0);         // 🖨️ 출력: 2.5  ← int / double → int가 double로 자동변환
        System.out.println(5.0/2.0);       // 🖨️ 출력: 2.5  ← double / double = double
        
        // 🔹 byte 범위: -128 ~ 127
        byte b1 = 127;
        // ⚠️ b1+3 = 130 → byte 범위 초과! 오버플로우 발생
        // 🔹 명시적 형변환 (byte)으로 강제 변환 → 비트가 잘려 음수로 둔갑
        // 🔹 130의 비트에서 하위 8비트만 취하면 → -126 (2의 보수 표현)
        byte b2  = (byte)(b1+3);
        System.out.println("b2 : "+b2);    // 🖨️ 출력: -126  ← 오버플로우로 인한 값 역전

        /* %d : 정수      %자리수d 	 %03d	
         * %f : 실수      %.자리수f: 실수의 소수 자리수 표현
         * %s : 문자열	 %c : 소문자 %C : 대문자
         * %b : 논리 
         */
        // 🔹 printf: 형식 지정자(format specifier)를 사용해 출력 형태를 지정
        // 🔹 %b=논리값, %d=정수, 출력 결과는 result/i/j 값을 순서대로 대입
        // 🖨️ 출력: result: false  i:11  j:5
        //    → result=false (i++>10이 false), i=11 (후위증가), j=5 (단락평가로 미실행)
        System.out.printf("result: %b  i:%d  j:%d", result, i, j);
    }
}