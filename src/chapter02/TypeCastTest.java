package chapter02;

/**
 * 자동으로 형변화환 되는 경우 
 * byte => short  => int => long => float => double
 *         char 
 *
 * - casting 
 *   명시적으로 형변환 
 * (변환할타입)값;
 * 
 */
public class TypeCastTest {
    public static void main(String[] args) {
        byte b1 = 3, b2=5;
        
        // ✅ 명시적 형변환(casting): (byte)를 앞에 붙여 int 연산 결과를 강제로 byte로 변환
        // ⚠️ 결과값이 byte 범위(-128~127)를 벗어나면 데이터가 잘려나가는 손실 발생!
        // 🔹 여기선 3+5=8이라 범위 내이므로 문제 없음
        byte b3 = (byte)(b1+b2);
        
        // 🔹 L 접미사 사용: int 범위(약 21억) 초과하는 값이므로 long 타입으로 선언
        long l1 = 2222222222L;
        
        // ✅ 자동 형변환(묵시적 casting): long → float
        // 🔹 float가 long보다 더 큰 범위를 표현할 수 있어서 자동으로 변환됨
        // ⚠️ 단, float는 정밀도(약 7자리)가 낮아 큰 정수값은 근사값으로 저장될 수 있음
        float f1 = l1;
        System.out.println("f1:"+f1);
        // 🖨️ 출력: 2.22222221E9 (지수 표기, 정밀도 손실로 원래 값과 약간 다름)
        
        // ✅ 명시적 형변환: float → long
        // 🔹 float가 long보다 더 넓은 타입이므로 반드시 (long)을 명시해야 함
        // ⚠️ 소수점 이하는 버림(truncation)처리됨 — 반올림 아님!
        // ⚠️ 이미 f1이 근사값이기 때문에 원래 l1값(2222222222)과 다를 수 있음
        long l2 = (long)f1;
        System.out.println("l2:"+l2);
        // 🖨️ 출력: 2222222208 (float 정밀도 손실 + 소수점 버림으로 원본과 차이 발생)
    }
}




