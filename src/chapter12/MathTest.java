package chapter12;

public class MathTest {
    public static void main(String[] args) {

        // 🔹 ceil: 올림 — 소수점이 있으면 항상 더 큰 정수 방향
        double v1 = Math.ceil(5.3);   // 🖨️ v1=6.0
        // 🔹 floor: 내림 — 소수점이 있으면 항상 더 작은 정수 방향
        double v2 = Math.floor(5.3);  // 🖨️ v2=5.0
        System.out.println("v1=" + v1);
        System.out.println("v2=" + v2);

        // 🔹 max: 두 값 중 큰 값, min: 두 값 중 작은 값
        long v3 = Math.max(3, 7);  // 🖨️ v3=7
        long v4 = Math.min(3, 7);  // 🖨️ v4=3
        System.out.println("v3=" + v3);
        System.out.println("v4=" + v4);

        // 🔹 소수점 둘째 자리까지 반올림하는 트릭
        // 💡 Math.round()는 소수 첫째 자리에서 반올림 → 정수 반환
        //    원하는 자릿수만큼 미리 ×100 → round → /100.0 으로 복원
        double value = 12.3456;
        double temp1 = value * 100;          // 1234.56
        long   temp2 = Math.round(temp1);    // 1235 (반올림)
        double v5    = temp2 / 100.0;        // 12.35
        // ⚠️ temp2 / 100 이면 정수 나눗셈 → 12, 반드시 100.0으로 나눠야 함
        System.out.println("v5=" + v5);  // 🖨️ v5=12.35

        /*
         * Math.random()  : 0이상 1미만의 난수를 발생 시킨다. 
         *  => seed 값이 현재 시간  
         */
        // 🔹 0 이상 50 미만: random()*50 → 0.0~49.9... → (int) → 0~49
        System.out.println((int)(Math.random() * 50));
        // 🔹 0 이상 50 이하: random()*51 → 0.0~50.9... → (int) → 0~50
        System.out.println((int)(Math.random() * 51));
    }
}