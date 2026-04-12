package chapter16;

/**
 * 함수형 인터페이스란 1 개의 추상 메소드를 갖는 인터페이스
 */

interface FunTest{
	void test();
}

//1. 클래스로 구현받기 
class SubFun implements FunTest{
	public void test() {
		System.out.println("클래스로 구현하기");
	};
	
}

class UseFun {
	public void use(FunTest f) {
		f.test();
	}
}
public class FuntionalInterfaceTest1 {
	public static void main(String[] args) {
		UseFun uf = new UseFun();
		uf.use(new SubFun());
		
		/*
		 * 2. 익명Nested로 구현 받기 
		 * 
		 * SuperType s = new SuperType(){  
		 * 	//선언과 동시에 생성하기 
		 * } 
		 *  */
		uf.use(new FunTest() {
			@Override
			public void test() {
				System.out.println("익명으로 구현하기");
			}
		});
		
		//람다로 
		
	}
}
