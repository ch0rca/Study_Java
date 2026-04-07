package chapter06;

/**
 * 클래스 선언 형식 
 * 
 * [public]| [final | abstract]  class 클래스이름{
 * 		//속성
 * 		[modifier] 데이타타입  속성명;
 * 
 * 
 *		//생성자
 * 		[access_modifier] 클래스이름([인자list]){}
 * 
 * 		//메서드선언
 * 		[modifier] 리턴타입/void   메소드이름([인자list]){}
 * } 
 */


public class  Customer {
	String name;
	int age;
	String address;
	/**
	 * default Constructor (기본 생성자)
	 *   - 클래스 내부에 생성자가 없으면 컴파일러가 인자가 없는 생성자를 선언
	 * 
	 * 생성자 Overloading
	 * 동일한 이름의 생성자를 인자(인자의 개수, 인자 타입, 인자의 순서)가 다르게 해서 
	 * 한개 이상 선언할 수 있다. 
	 * 
	 * */
	public Customer( ) {
		this("ureca",4,"서울");
	}
	
	/**
	 * this : this는   this를 작성한 클래스로 부터 생성된 객체 중 현재 사용 중인 객체를 참조  
	 *  1. 속성과 로컬변수 이름이 같을 때 구별하기 위해 속성 앞에 this.을 붙인다. 
	 *  2. 코드 재사용을 위해 인자가 다른 생성자를 호출할 때 this(~)를 사용한다. 
	 *      주의점: 생성자 호출은 생성자의 첫번째 명령에서만 호출이 됨.
	 *  3. 클래스 내부에서 해당 클래스의 객체가 필요한 경우 
	 *     ex) 이벤트 처리     
	 */
	public Customer(String name, int age, String address) {
		/*
		 * 속성 : 클래스 내부에서는 어디서든 접근해서 사용가능 
		 *       access modifier에 따라 클래스 외부에서도 객체를 통해 접근 가능
		 *       
		 * 지역변수(local variable)
		 *  - 변수를 선언한 block 내부에서만 접근 가능   
		 *  
		 *     
		 */
		this.name  = name;
		this.age = age;
		this.address = address;
	}
	
	String customerInfo() {
		return "이름:"+name+" 나이:"+age+" 주소:"+address;
	}
	
	public boolean equals(Customer cust) {
		return this == cust;
	}
}






