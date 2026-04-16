package chapter07;

/**
 * 다형성 관계에서 Override된 속성과 메서드 접근  
 */
class Super{
	String name="super";
	public String toString() {
		return "Super name:"+name;
	}
	
	public static void test() {
		System.out.println("Super의 test 함수");
	}
}
class Sub extends Super{
	String name="Sub";
	public String toString() {
		return "Super name:"+super.name+" Sub name:"+name;
	}
	public static void test() {
		System.out.println("Sub의 test 함수");
	}
}
public class PolymorphismTest2 {
	public static void main(String[] args) {
		Super sup = new Super();
		System.out.println(sup.name);
		System.out.println(sup);
		sup.test();
		System.out.println("================");
		Sub sub = new Sub();
		System.out.println(sub.name);
		System.out.println(sub);
		sub.test();
		System.out.println("=======다형성=========");
//		다형성 
		Super s = new Sub();
//		다형성 관계에서 Override된 메서드가 호출됨.
		System.out.println(s);
		
//		다형성 관계에서 속성은 super에 접근됨. 
		System.out.println(s.name);
		s.test();
		System.out.println("=====다운 캐스팅===");
		Sub sub2 =  (Sub) s;
		System.out.println(sub2.name);
		sub2.test();
	}
}





