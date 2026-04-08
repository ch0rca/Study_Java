package chapter06;

import java.util.Calendar;

/**
 * modifier(제어자)
 * 
 * access modifier		public 	protected	생략(default)	 private
 * usage  modifier		abstract	static	final
 * 
 * access modifier	: 클래스, 메서드, 속성에 대한 접근을 제한한다.
 * 		public 		: 접근 제한이 전혀 없다. 
 * 		protected	: 상속 관계에서는 제한이 없다. 상속 관계가 아니면 같은 package가 아닌 경우 접근 불가 
 * 		생략(default): 같은 package가 아닌 경우 접근 불가
 * 		private		: 선언한 클래스 내에서만 접근 가능
 * 		
 * usage  modifier	: 클래스, 메서드, 속성의 기능을 제한한다.
 * 
 * 
 * Encapsulation(캡슐화)
 *  - 대부분의 속성과 일부 메소를 private, default(생략), protected를 이용해서 캡슐로 쌓는 기능 
 *  - 목적
 *    1. 보호 
 *    2. 은닉 ==> decouple 효과 및 유지보수성을 높인다. 
 *    
 *  - 접근할 수 있는 public한 메서드(getter, setter)를 제공해야 한다.  
 */


public class MyDate{
	private int year, month, date;
	public MyDate() {}
	public MyDate(int year, int month, int date) {
		setYear(year);
		setMonth(month);
		setDate(date);
	}

	public void setYear(int year) {
		if(year<2024) {
			System.err.println("연도는 2024년 이후로 설정해주세요");
		}else {
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;
		}else {
			System.err.println("1월부터 12월 사이로 설정해주세요");
		}
	}
	
	public void setDate(int date) {
		//작은달 , 큰달만 검사해서 유효한 일자를 설정하기 
		if(date<1|| date>31) {
			System.err.println("일자는 1일부터 31일 사이로 설정해주세요");
		}else {  
			//date는 1~31일까지 
			if(isValid(date)) {
				this.date = date;
			}else {
				System.err.printf("%d일은 %d월에 설정 할 수 없는 날짜입니다.%n", date, month);
			}
		}
	}

	//작은 달만 검사하는 함수 
	private boolean isValid(int date) {
		if (month==2 && date >28) 			return false;
		if((month==4||month==6||month==9||month==11) && date>30) return false; 
		return true;
	}
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}
	public void setDate(int year, int month, int date) {
		setYear(year);
		setMonth(month);
		setDate(date);
	}
	public String toString() {
		return year+"."+month+"."+date;
	}
	
}




















