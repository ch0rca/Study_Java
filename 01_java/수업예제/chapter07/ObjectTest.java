package chapter07;

public class ObjectTest {

	public static void main(String[] args) throws Exception {
		
		Employee emp1 = new Employee("1", "ureca", 3500000);
		Employee emp2 = new Employee("1", "ureca", 3500000);
		
//		Employee emp3 = (Employee)emp1.clone();
		
		
		Object o;
		
//		 == 는 메모리 값을 비교하기 때문에 객체는  hashcode를 비교하게 됨. 
		System.out.println(emp1 == emp2 );
		
//		객체 내용을 비교할 때는 equals(~)를 이용해서 비교해야 한다. 
		System.out.println("emp1.equals(emp2) :"+emp1.equals(emp2));
		
		System.out.printf("emp1.hashcode : %d\n", emp1.hashCode());
		System.out.printf("emp2.hashcode : %d\n", emp2.hashCode());
		
//		emp1.clone();
		emp1 = null;
		emp2 = null;
		
		try {
			//GC는 우선순위가 낮아서 호출 되지 않을 수 있다. 
			//GC 정보를 출력할 경우  java -verbose:gc  클래스이름   ex)java -verbose:gc chapter07.ObjectTest
			System.gc();
		} catch (Exception e) {
		}
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println("main end..... ");
	}
}




