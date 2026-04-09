package chapter07;

import chapter07.sub.RnD;

public class PolymorphismTest1 {

	public static void main(String[] args) {
		/*
		 * Reference 다형성 
		 * - Super 타입의 변수로  sub타입의 객체를 참조할 수 있다.
		 */
		Employee emp1 = new Employee();
		emp1 = new Manager();
		emp1 = new Engineer();

		
//		Manager mg1 = new Employee();			//다형성이 아니기 때문에 컴파일 오류 발생 
//		Engineer eng1=new Employee();
		
//		다형성 관계에서는 sub에 추가된 속성, 메서드에 접근 불가 => Shadow Impact
//		System.out.println(emp1.getSkill());
		/*
		 * Reference 형변환 
		 * 자동 형변환(Up casting)     sub 타입에서 super 타입으로 형변환시
		 * 			=> 모든 sub타입은 super 타입으로 자동 형변환 됨. 
		 *  
		 * 명시적 형변환(Down casting)  super 타입에서 sub 타입으로 형변환시
		 * 			=> super타입이 참조하고 있는 객체의  sub타입으로만 형변환 됨. 
		 * 
		 * ClassCastException : 참조하고 있는 객체가 아닌 다른 타입으로 형변환시 발생 
		 */
		Engineer eng2 = (Engineer) emp1;		  //emp1이 Engineer 객체를 참조 하고 있기 때문에 형변환됨.
		
		//emp1은 Engineer 객체를 참조하고 있는데 Manager로 형변환 하면 ClassCastException이 실행시 발생한다. 
//		Manager  mgr1 = (Manager) emp1;
		
		
		Employee emp3 = new Employee();			
//		Engineer eng3 = (Engineer) emp3;
//		Manager  mgr3 = (Manager) emp3;
		
//		emp1변수가 참조하는 객체는 Engineer이므로 Mananger로 형변환시 ClassCastException 발생
//		Manager  mgr2 = (Manager)emp1;	
		
		/*
		 * instanceof : Reference 타입에 대한 형검사.
		 * 형식]   객체 instanceof Type
		 *   - 객체가 해당 타입이면 true, 해당 타입이 아니면  false
		 *   주의사항 : 형검사시 sub타입 부터 검사해야 한다. 
		 *   
		 */
//		if (emp1 instanceof Employee) {
//			System.out.println("emp1은 Employee입니다.");
//		}else if (emp1 instanceof Engineer) {
//			Engineer eng4 = (Engineer) emp1;
//			System.out.println("emp1dms Engineer입니다.  skill :"+eng4.getSkill());
//		}
		if (emp1 instanceof Engineer) {
			Engineer eng4 = (Engineer) emp1;
			System.out.println("emp1은 Engineer입니다.  skill :"+eng4.getSkill());
		}else if (emp1 instanceof Manager) {
			Manager mgr4 = (Manager) emp1;
			System.out.println("emp1은 Manager입니다.  position :"+mgr4.getPosition());
		}else if (emp1 instanceof Employee) {
				System.out.println("emp1은 Employee입니다.");
		} 

		
		/*
		 * Virtual Invocation(Dynamic binding = Dynamic link)
		 * - 다형성 관계에서 Override된 메서드가 호출됨.
		 */
		System.out.println(emp1);
		
		Employee[] emps = new Employee[2];
		emps[0] = new Engineer("1", "ureca", 7000000, "spring");
		emps[1] = new RnD();
		for (Employee emp : emps) {
			emp.test();
		}
		
		System.out.println("main end.......");
	}
}






























