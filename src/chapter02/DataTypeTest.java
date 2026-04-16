package chapter02;

public class DataTypeTest {
    public static void main(String[] args) {
        /*
         * 정수형에서 int가 기본 타입으로 사용됨
         * byte, short 타입은 변수로 연산시 int로 자동 변환됨.  
         */
        // 🔹 byte 타입: -128 ~ 127 범위의 정수 저장 (1byte)
        byte b1 = 3, b2 = 5;
        
//      byte b3 = b1+b2;
        // ⚠️ 위 코드가 에러인 이유: b1+b2 연산 결과는 자동으로 int로 변환됨
        //    → 결과값(int)을 byte 변수에 바로 담을 수 없어서 컴파일 에러 발생
        
        // 🔹 int 타입: 정수형의 기본(default) 타입 (4byte, -21억 ~ 21억)
        // 🔹 byte 연산 결과(int)를 int 변수에 받으면 OK
        int  i1 = b1+b2;
        
        // 🔹 long 타입: int보다 큰 정수 저장 (8byte)
        long l1 = 125;
        // 🔹 int 범위를 초과하는 숫자 뒤에는 반드시 L 또는 l을 붙여야 함
        //    붙이지 않으면 컴파일러가 int로 인식해 에러 발생
        long l2 = 21111111111L;
        
//      float를 선언할 경우 f, F를 붙여야 한다. 
        // 🔹 float 타입: 소수점 있는 실수 저장 (4byte, 약 7자리 정밀도)
        // 🔹 Java에서 소수점 리터럴은 기본이 double이므로 f/F를 붙여 float 명시
        float f1 = 3.14f,  f2=3.14F;
        // 🔹 f3: 정수부가 크더라도 float에 저장 가능하지만 정밀도 손실이 생길 수 있음
        float f3 = 65536.256f;
        System.out.println("f1: "+f1);  // 🖨️ 출력: 3.14
        System.out.println("f3: "+f3);  // 🖨️ 출력: 65536.258 (float 정밀도 한계로 미세한 오차 발생)
        
        // 🔹 double 타입: 실수형의 기본(default) 타입 (8byte, 약 15자리 정밀도)
        // 🔹 d, D 접미사는 생략 가능 (소수점 리터럴은 기본이 double)
        double d1 = 65536.256, d2=3.14d, d3= 3.14D;
        // 🔹 double도 무한한 정밀도를 갖지는 않음 → 마지막 자리에서 반올림/절사 발생
        double d4 = 1.2345678901234569890;
        System.out.println("d1:"+d1);   // 🖨️ 출력: 65536.256
        System.out.println("d4:"+d4);   // 🖨️ 출력: 1.2345678901234568 (소수점 이하 약 15~16자리까지만 표현)
        
        // 🔹 char 타입: 문자 하나를 저장 (2byte, 유니코드 기반)
        // 🔹 작은따옴표('')로 감싼 문자 1개만 저장 가능
        char c1='a';
        
//      java는 논리에 true, false의 값만 저장할 수 있다. 1 or 0은 저장할 수 없다.  
        // 🔹 boolean 타입: true 또는 false만 저장 (C언어처럼 1/0 사용 불가)
        // 🔹 주로 조건문(if, while 등)의 조건식에서 사용
        boolean bl1 =true;
    }
}











