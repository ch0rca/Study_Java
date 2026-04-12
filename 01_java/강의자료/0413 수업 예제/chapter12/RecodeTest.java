package chapter12;


/**
 * Recode : 
 *  - DTO (Data Transfer Object)를 간략하게 작성하기
 *  - getter, toString(), equals(), hashCode()를 자동으로 Generation
 *  - 형식]
 *  public record 이름([인자리스트]){}
 */
public class RecodeTest {
	public static void main(String[] args) {
		MyRecord r1 = new MyRecord("ureca", 4,"코딩");
		MyRecord r2 = new MyRecord("ureca", 4,"코딩");
		System.out.println(r1.name());
		System.out.println(r1.age());
		System.out.println(r2.hobby());
		System.out.println("r1:"+r1);
		System.out.println(r1.equals(r2));
		System.out.println("r1.hashCode:"+r1.hashCode());
		System.out.println("r2.hashCode:"+r2.hashCode());
	}	
	public record MyRecord(String name, Integer age, String hobby) {};
}




