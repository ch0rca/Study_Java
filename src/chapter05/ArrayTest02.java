package chapter05;

public class ArrayTest02 {
    public static void main(String[] args) {

        // 🔹 여러 배열을 같은 인덱스로 묶어서 처리하는 패턴 (나중에 객체/클래스로 발전)
        String[] names = { "강소연","권순국","김경규","김동훈","김민경"};
        int[] java   = {95, 90, 98, 96, 95};
        int[] db     = {95, 100, 90, 93, 90};
        int[] spring = {90, 9, 100, 97, 100};

        // 🔹 new int[names.length]: names 배열 길이(5)만큼 total 배열 자동 생성
        // 💡 names.length를 활용해 배열 크기를 맞추면 한 명이 추가돼도 코드 수정 불필요
        int[] total    = new int[names.length];
        double[] avg   = new double[names.length];

        // 🔹 정수/정수 = 정수이므로 num을 double로 선언해 실수 나눗셈 유도
        double num = 3;

        System.out.println("===============================================");
        System.out.println("이름\t자바\t디비\tspring\t총점\t평균");
        System.out.println("===============================================");

        for (int i = 0, size = names.length; i < size; i++) {
            total[i] = java[i] + db[i] + spring[i];
            // 🔹 total[i]는 int, num은 double → int가 double로 자동 형변환 → 실수 결과
            avg[i] = total[i] / num;
            // 🔹 %.1f: 소수점 첫째 자리까지만 출력
            // 🔹 \t: 탭 문자로 열을 맞춤, \n: 줄바꿈
            System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",
                    names[i], java[i], db[i], spring[i], total[i], avg[i]);
        }
    }
}