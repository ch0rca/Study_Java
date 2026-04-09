package chapter07;

public class MainCustomer extends Customer {
	private String hobby;
	public MainCustomer() {
		this("ureca", 4, "서울","코드");
	}
	public MainCustomer(String name, int age, String address, String hobby) {
		/*
		 * 부모의 생성자 호출
		 *  - super([인자-리스트])
		 *  - 생성자의 첫번째 명령에서만 super(~)로 호출할 수 있다. 
		 */
		super(name, age, address);
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		setName(name);
//		setAge(age);
//		setAddress(address);
		this.hobby = hobby;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	/**
	 * method override(메서드 재정의)
	 * 상속 받은 메서드와 동일한 이름의 메서드를 선언.
	 * 
	 * - 상속 받은 메서드와 전체적인 기능은 동일하지만 상세 구현이 조금 다를 경우 
	 *   기존의 상속 받은 메서드를 사용할 수 없으므로 새로운 메서드를 추가로 선언해야 한다. 
	 *   이때  상속 받은 메서드와 이름, 인자, 리턴 타입을 동일하게 선언한다.
	 *   
	 * - 이름과 인자는 반드시 같아야 한다.   
	 * - 리턴 타입
	 *    - primitive   :  반드시 같아야 한다.   
	 *    - Reference
	 *      - 동일한 타입으로 리턴을 하거나  sub를 리턴해도 된다.
	 *      ex)
	 *      class Super{
	 *      	public Customer getCustomer(){}
	 *      }  
	 *      
	 *   
	 *   	class Sub extends Super{
	 *   		public Customer getCustomer(){}
	 *      }
	 *      or
	 *      class Sub extends Super{
	 *   		public MainCustomer getCustomer(){}
	 *      }
	 *      
	 * - Exception을 throws할때는 동일한 예외를 throws하거나 , sub 예외를 throws하거나 , 아무 예외도 throws 안해도 된다. 
	 * 
	 * - access modifier는 같거나 더 넓은 범위로 
	 * 
	 * - 효과 
	 *   1. 상속 받은 메서드와 이름, 인자가 같으므로 메서드 호출 방법이 기존 코드와 동일하고
	 *      리턴 타입이 같으므로 호출 후 처리 방법이 동일하다. 
	 *      ==> 기존의 코드를 수정하지 않고 변경된 내용을 반영할 수 있다. 
	 *         
	 *   2. 동일한 기능인 경우 부모,자식 구별할 필요 없이 동일한 이름으로 호출한다. 
	 *      ==> 호출에 대한 편리성 제공 , 유지 보수성 높임  
	 *      
	 *   3. 다형성 관계에서는 Override된 함수가 호출됨. ==>  Virtual Invocation
	 *      ==> 기존의 코드를 수정하지 않고 변경된 내용을 반영할 수 있다. 
	 *      
	 *   4. shadow Impact를 해결 
	 *      => Overried 된 메서드는 sub의 메서드 이므로 sub에 추가된 속성이나 함수에 
	 *         접근 가능 
	 *      
	 */
	public String toString() {
//		return "이름:"+getName()+" 나이:"+getAge()+" 주소:"+getAddress()+" 취미:"+hobby;
		/* 
		 * super  : 부모 객체를 참조
		 *   -재정의에 의해 무시된 속성이나 메서드에 접근할 경우 super. 사용한다. 
		 * */
		return super.toString()+" 취미:"+hobby;
	}
	
//	public String mainToString(){
//		return "이름:"+getName()+" 나이:"+getAge()+" 주소:"+getAddress()+" 취미:"+hobby;
//	}
	
}




