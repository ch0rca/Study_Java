package chapter13;

class Box<T> {
	// 필드
	private T t;

	// Getter 메소드
	public T get() {
		return t;
	}
	// Setter 메소드
	public void set(T t) {
		this.t = t;
	}
}

/**
 * 제네릭 메소드
 * 파라미터를 제네릭로 선언하는 메서드 
 * 형식]
 * [modifier] <타입파라미터> 리턴타입 함수명(타입매개변수,...){} 
 */
public class GenericTest2 {
	//제네릭 메소드
	
	public static void main(String[] args) {
		//제네릭 메소드 호출
//		Box<Integer> box1 = boxing(100);
//		int intValue = box1.get();
//		System.out.println(intValue);
		
		//제네릭 메소드 호출
//		Box<String> box2 = boxing("홍길동");
//		String strValue = box2.get();
//		System.out.println(strValue);
	}
}
