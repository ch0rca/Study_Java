package chapter15;

import java.util.HashSet;

import chapter07.Employee;


/**
 * 
 * Set 
 *  - 동일한 객체를 저장하지 않음  
 *    => 데이타의 유니크성을 보장 
 *  - add(Object o), contains(Object o), remove(Object o)에서 
 *    equals(Object o)와 hashCode()를  호출하여 객체가 같은지 비교한다.
 *  - 데이타를 저장한 순서대로 저장하지 않는다. 
 *  - index가 없다.   
 */
public class SetTest {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		System.out.println(set1.add("hello"));
		System.out.println(set1.add("hello"));
		System.out.println(set1.add("world"));
		System.out.println(set1.add("ssafy"));
		System.out.println(set1);
		
		HashSet<Employee> set2 = new HashSet<>();
		System.out.println(set2.add(new Employee("1", "1", 1)));
		System.out.println(set2.add(new Employee("1", "1", 1)));
		System.out.println(set2);
		
		for (String  str : set1) {
			System.out.println(str);
		}
	}
}












