package chapter16;

import java.util.Arrays;
import java.util.Comparator;

import chapter07.Employee;

public class SortTest {
	public static void main(String[] args) {
		
		/* 
		 * Arrays.sort(프리미티브[])   				: 오름 차순 정렬
		 * Arrays.sort(프리미티브[], Comparator<T>)	: 정렬 방법 지정
		 * 
		 *  Arrays.sort(T[], Comparator<T>)
		 * */
		int[] array1 = {3,6,1,8,2,9};			
		Arrays.sort(array1);	
		System.out.println(Arrays.toString(array1));
		
		Employee emp1 = new Employee("1", "ureca2", 3500000);
		Employee emp2 = new Employee("2", "ureca1", 4500000);
		
		Employee[] emps = {emp1, emp2};
		
		//Arrays.sort(emps);     //Employee 클래스에 Comparable 인터페이스를 구현해야 한다. 
		
		//compare    같으면 0,  크면 양수, 작으면 음수  => 오름 차순으로 정렬
//		Arrays.sort(emps, (e1, e2) ->{ return e1.getSalary() - e2.getSalary();});
		
//		Arrays.sort(emps, (e1, e2) ->{ return e2.getSalary() - e1.getSalary();}); //내림 차순 정렬
		
//		Arrays.sort(emps, (e1, e2) ->{ return e1.getName().compareTo(e2.getName()) ; }); //오름 차순 정렬
		
		Arrays.sort(emps, (e1, e2) ->{ return e2.getName().compareTo(e1.getName());});   //내림 차순 정렬
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
}
