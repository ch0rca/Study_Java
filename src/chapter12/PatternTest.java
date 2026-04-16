package chapter12;

import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {

        // 🔹 전화번호 정규식 분해
        //    (02|010) : 02 또는 010
        //    -        : 하이픈 문자 자체
        //    \\d{3,4} : 숫자 3~4자리 (\\d는 정규식에서 숫자, Java 문자열에선 \\로 표현)
        //    -        : 하이픈
        //    \\d{4}   : 숫자 4자리
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data   = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다.");    // 🖨️ 출력됨
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }

        // 🔹 이메일 정규식 분해
        //    \\w+      : 영문·숫자·밑줄 1개 이상
        //    @         : @ 문자
        //    \\w+      : 도메인명
        //    \\.       : 점(.) 문자 자체 (\\.으로 써야 함 — . 단독은 정규식에서 임의 문자)
        //    \\w+      : 최상위 도메인(com, net 등)
        //    (\\.\\w+)?: 서브도메인(co.kr 등) 0개 또는 1개
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data   = "angel@navercom";  // ⚠️ @와 com 사이에 . 없음
        result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");  // 🖨️ 출력됨
        }
    }
}