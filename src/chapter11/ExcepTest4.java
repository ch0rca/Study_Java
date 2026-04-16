package chapter11;

import chapter07.Employee;

public class ExcepTest4 {
    public static void main(String[] args) {

        try {
            // ⚠️ int 최댓값(약 21억)에 가까운 크기의 배열 세 개를 동시에 생성 시도
            //    → JVM Heap 메모리가 부족해 OutOfMemoryError 발생
            Employee[] emps1 = new Employee[2111111111];
            Employee[] emps2 = new Employee[2111111111];
            Employee[] emps3 = new Employee[2111111111];

        } catch (Throwable e) {
            // 🔹 Error는 Exception의 형제 계열 → Exception catch로는 잡히지 않음
            // 🔹 Error·Exception 공통 부모인 Throwable로 잡아야 Error도 처리 가능
            // ⚠️ 실무에서는 Error를 catch하는 건 거의 의미 없음
            //    → 메모리 부족 상태에서 추가 작업 자체가 위험
            System.out.println("메모리가 부족합니다.");
        }

        // 🔹 Throwable로 잡아 처리했으므로 프로그램이 계속 실행됨
        System.out.println("main end.....");  // 🖨️ main end.....
    }
}
