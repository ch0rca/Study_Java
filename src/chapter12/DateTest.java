package chapter12;

import java.text.*;
import java.util.*;

public class DateTest {
    public static void main(String[] args) {
        // 🔹 new Date(): 현재 날짜·시간을 담은 Date 객체 생성
        // 💡 Date는 오래된 API — 현재는 java.time 패키지(LocalDate 등)를 더 많이 사용
        Date now = new Date();

        // 🔹 toString(): 기본 출력 형식 — 사람이 읽기 불편한 형태
        // 🖨️ Mon Apr 08 14:30:00 KST 2026 (영문, 형식 고정)
        System.out.println(now.toString());

        // 🔹 SimpleDateFormat: 원하는 형식으로 Date를 문자열로 변환
        //    yyyy=4자리 년도, MM=2자리 월, dd=2자리 일
        //    HH=24시간제 시, mm=분, ss=초
        // ⚠️ MM(월)과 mm(분) 대소문자 구분 필수 — 바꾸면 엉뚱한 값이 나옴
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strNow2 = sdf.format(now);
        // 🖨️ 2026.04.08 14:30:00
        System.out.println(strNow2);
    }
}