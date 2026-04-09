package chapter07;

import java.util.Objects;

public class Employee {
	private String empno;
	private String name;
	private int salary;
	public Employee() {}
	public Employee(String empno, String name, int salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	
	protected void test() {
		System.out.println("Employee의 Test 함수");
	}
	
	/**
	 * clone : 객체 복제하는 기능 
	 * - 사용하기 위해 반드시 Override
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	/**
	 * equals : 객체의 내용이 같은지 비교하는 함수 
	 * - 사용하기 위해 반드시 Override
	 */
//	public boolean equals(Object obj) {
//		// instanceof : 객체의 타입을 검사하는 연산자 
//		if (obj instanceof Employee) {
//			Employee emp = (Employee) obj;
//			if(empno.equals(emp.empno) && name.equals(emp.name)  && salary == emp.salary) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	/** 
	 * hashCode() 
	 *   - 객체의 hashCode를 리턴한다. 
	 *   - 필요하면 Override  => Set 계열의 자료구조를 사용할 때 
	 * */
//	@Override
//	public int hashCode() {
//		return Objects.hash(empno, name, salary);
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empno, other.empno) && Objects.equals(name, other.name) && salary == other.salary;
	}

	/** 
	 * GC가 객체를 메모리에서 제거할 때 호출되는 메서드 
	 *  ==> 불필요한 코드로 Override할 경우 성능이 저하 되므로 꼭 필요할 때만 Override
	 *     ==> 객체가 큰 메모리를 사용하는 경우 (이미지나 큰 배열)
	 * */
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.hashCode() +"finalize().......");
	}
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary < 2000000) {
			this.salary = 2000000;
		}else {
			this.salary = salary;
		}
	}
	
	/**
	 * toString()
	 * 객체의 내용을 문자열로 변경해서 리턴하는 기능 
	 * - 필요시  Override 
	 * - 콘솔에 출력할 때 String.valueOf()에 의해 호출됨.  System.out.print~
	 * - 문자열(String) 에 + 객체 할때 toString()가 JVM에 의해 자동 호출됨.   
	 */
	@Override
	public String toString() {
//		super.toString();
		return "empno=" + empno + ", name=" + name + ", salary=" + salary ;
	}
}











