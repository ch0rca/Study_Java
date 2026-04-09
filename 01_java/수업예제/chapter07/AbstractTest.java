package chapter07;

import java.util.Calendar;

import javax.print.Doc;

/**
 * abstract : 추상적인 특징을 부여 
 *   메서드 :
 *     - 메서드의 선언부만 작성하고 구현을 하지 않음 
 *     - sub class에서 추상 메서드를 반드시 Override 하도록 위임 
 *       => sub class에서 추상 메서드를 Override하지 않으면 컴파일 에러 발생 
 *     - 형식]
 *      [access modifier] abstract 리턴타입 메서드명([인자들...]);
 *     - 목적
 *       1. sub들의 구현부가 서로 너무 달라서 공통코드가 없는 경우 
 *       2. 미래에 어떻게 변경될지 예측할 수 없을 경우   
 *       3. Sub에서 반드시 Override 하도록 설계시 제어  
 *     - 효과 
 *       1. 가볍게 상속 
 *       2. Override에 대한 성능 저하가 조금 감소
 *  
 *   클래스 : 
 *	   - 추상 클래스는 객체 생성을 할수 없다. 
 *     - 상속 전용으로 사용   => 다형성으로 사용 
 *     - 클래스 내에 추상 메서드가 한개라도 있다면 추상 클래스로 선언해야 한다.  
 */

class Animal{
	private String name;
	private String kind;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

//상속 받은 추상 메서드를 구현하기 힘든 상황인 경우 클래스를 추상으로 선언해서 
//sub에서 구현하도록 한다. 
abstract class Mammal extends Animal{
	
}

class Dog extends Animal{
	public void keep() {
		Calendar today = Calendar.getInstance();
		int time = today.get(Calendar.HOUR_OF_DAY);
		if(time >=9 && time <18) {
			System.out.println("잘 지키고 있어요");
		}else {
			System.out.println("나도 좀 쉽시당!!!");
		}
	}
}
class Duck extends Animal{
	public Duck() {}
	public Duck(String name, String kind, int age) {
	}

	public void fly() {
		String kind = getKind();
		if(kind == null || kind.equals("집오리")) {
			System.out.println("오리는 날수 없다 엄마에게 혼났죠~~~ ㅜ.ㅜ");
		}else {
			System.out.println("날아올라 저 하늘 날고 있어요. 이렇게 멋진 날개를 펴~");
		}
	}
}
public class AbstractTest {
	public static void main(String[] args) {
//		추상 클래스는  생성자를 통해 객체 생성 불가 
		
//		추상 클래스라도 다형성에 의해 sub객체를 참조할 수 있다. 
		
//		추상 클래스라도 배열 객체는 생성할 수 있다. 
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Duck("채리필터", "오리날다", 1997);
		for (Animal animal : animals) {
//			if (animal instanceof Dog) {
//				Dog dog = (Dog) animal;
//				dog.keep();
//			}else if (animal instanceof Duck) {
//				Duck duck = (Duck) animal;
//				duck.fly();
//			}
		}
	}
}










	
