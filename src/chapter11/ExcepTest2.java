package chapter11;

public class ExcepTest2 {
    public static void main(String[] args) {
        int result = 0;

        try {
            // 🔹 args[0]: 프로그램 실행 시 전달된 첫 번째 인자
            // ⚠️ 인자 없이 실행 → args가 비어 있음 → ArrayIndexOutOfBoundsException 발생
            // ⚠️ 인자가 숫자가 아닌 문자("abc") → NumberFormatException 발생 (현재 주석처리)
            // ⚠️ 인자가 "0" → ArithmeticException (0으로 나누기) 발생
            result = 256 / Integer.parseInt(args[0]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("데이타를 입력해 주세요");
            // 💡 catch 순서: 구체적인 예외 타입부터 → Exception을 먼저 쓰면 여기 못 옴

        //} catch (NumberFormatException e) {
        //  System.out.println("정수를 입력해 주세요");
        //  // 🔹 현재 주석 처리 → 숫자가 아닌 입력은 Exception catch에서 잡힘

        } catch (ArithmeticException e) {
            System.out.println("0이 아닌 정수를 입력해 주세요");
            // 🔹 return: catch 안에서 return해도 finally는 반드시 실행됨
            return;

        //} catch (Exception e) {
        //  System.err.println("잘못 입력했습니다. 다시 입력하세요");
        //  // 🔹 Exception은 모든 예외를 잡으므로 맨 마지막에 써야 함

        } finally {
            // 🔹 finally: 예외 발생 여부와 무관하게 항상 실행
            // 🔹 실행되는 4가지 경우:
            //    1. 예외 없이 정상 종료 시
            //    2. 예외 발생 후 catch에서 처리된 경우
            //    3. 예외가 발생했지만 처리 안 된 경우
            //    4. catch 또는 try 안에서 return된 경우
            // ⚠️ 단, System.exit()으로 JVM 강제 종료 시에는 실행 안 됨
            System.out.println("finally 문장이 수행됐습니다.......");
        }

        // 🔹 ArithmeticException catch에서 return했으면 여기까지 오지 않음
        System.out.printf("결과 : %d\n", result);
    }
}