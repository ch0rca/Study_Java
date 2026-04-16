package chapter12;

import java.util.*;

public class CalendarTest {
    public static void main(String[] args) {
        // 🔹 Calendar.getInstance(): 현재 날짜·시간을 가진 Calendar 객체 반환
        //    Calendar는 abstract 클래스 → 직접 new 불가, getInstance()로 획득
        Calendar now = Calendar.getInstance();

        int year  = now.get(Calendar.YEAR);
        // ⚠️ MONTH는 0-based (0=1월, 11=12월) → 실제 월 표시 시 반드시 +1
        int month = now.get(Calendar.MONTH) + 1;
        int day   = now.get(Calendar.DAY_OF_MONTH);

        // 🔹 DAY_OF_WEEK: 1=일요일, 2=월요일 ... 7=토요일 (Calendar 상수 사용 권장)
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch (week) {
            case Calendar.MONDAY:    strWeek = "월"; break;
            case Calendar.TUESDAY:  strWeek = "화"; break;
            case Calendar.WEDNESDAY:strWeek = "수"; break;
            case Calendar.THURSDAY: strWeek = "목"; break;
            case Calendar.FRIDAY:   strWeek = "금"; break;
            case Calendar.SATURDAY: strWeek = "토"; break;
            default:                strWeek = "일";
        }

        // 🔹 AM_PM: Calendar.AM(0) 또는 Calendar.PM(1)
        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = (amPm == Calendar.AM) ? "오전" : "오후";

        // 🔹 HOUR: 12시간제, HOUR_OF_DAY: 24시간제
        int hour   = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.print(year + "년 ");
        System.out.print(month + "월 ");
        System.out.println(day + "일 ");
        System.out.print(strWeek + "요일 ");
        System.out.println(strAmPm);
        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.println(second + "초 ");
    }
}