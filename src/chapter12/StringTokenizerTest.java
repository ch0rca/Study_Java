package chapter12;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {

        // 🔹 split(정규식): 여러 구분자를 동시에 처리 가능
        //    "&|," = & 또는 , 로 분리 (정규식 OR 연산자 |)
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");
        for (String token : arr) {
            System.out.println(token);  // 🖨️ 홍길동 / 이수홍 / 박연수
        }
        System.out.println();

        // 🔹 StringTokenizer: 정규식 없이 단순 구분자 처리, 한 개씩 꺼내는 방식
        // 💡 split보다 빠르다고 알려져 있지만 현대 JVM에서는 차이 미미
        //    split의 정규식 지원이 더 유연해서 실무에서는 split을 더 많이 써요
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        // 🔹 hasMoreTokens(): 다음 토큰이 있으면 true
        while (st.hasMoreTokens()) {
            String token = st.nextToken();  // 🔹 다음 토큰 하나 꺼냄
            System.out.println(token);  // 🖨️ 홍길동 / 이수홍 / 박연수
        }
    }
}