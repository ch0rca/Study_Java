package chapter15;

import java.util.ArrayList;
import java.util.LinkedList;

import chapter07.Employee;
import chapter07.Manager;


/**
 * List :  
 *   - 데이타를 저장한 순서대로 저장해 준다. 
 *   - 데이타의 Index는 0부터 size()-1이다
 *   - 중간 삽입할 수 있는 Index는  0부터 size()까지 이다. 
 *     => 범위를 벗어나면 IndexOutOfBoundsException이 발생한다.   
 *   - 데이타를 중복해서 저장할 수 있다. 
 *   -  indexOf(Object o), lastIndexOf(Object o), contains(Object o)
 *    , remove(Object o)에서 해당 기능을 수행하기 위해   equals(Object o)를 
 *      호출해서 객체가 같은지 비교후 처리한다. 
 *   
 */
public class ListTest {
	public static void main(String[] args) {
		
		/*java5에   컬렉션에 Generic을 적용
		 * - 선언과 생성시 저장할 타입를 지정
		 *   => 지정한 타입 외에는 저장할 수 없다. 
		 * - 추출시 형변환 없이 바로 사용
		 * 형식]
		 * 컬렉션<저장할타입> 변수 = new  컬렉션<저장할타입>();
		 *  */
		ArrayList<Employee> list2 = new ArrayList<Employee>(10);
//		Generic 설정시 선언과 생성에서 다형성 안됨. 
//		ArrayList<Employee> list2 = new ArrayList<Manager>(10);
		list2.add(new Employee("1","ssafy", 500000));
		//Generic을 super타입으로 설정하면 다형성에 의해 sub도 저장 가능 
		list2.add(new Manager());   
//		list2.add("hello");		//Generic에 의해 설정된 타입 외에는 저장 불가 
		
		Employee emp = list2.get(1);
		System.out.println(emp);
		
		int index = list2.indexOf(new Employee("1","ssafy", 500000));
		System.out.println("index :"+index);
		
	}
}




















