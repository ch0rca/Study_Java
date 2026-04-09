package chapter07;

public class Engineer extends Employee {
	private String skill;
	public Engineer() {	}
	public Engineer(String empno, String name, int salary, String skill) {
		super(empno, name, salary);
		this.skill = skill;
	}
	public void test() {
		//super.test();    //Employee와 Engineer는 같은 패키지 이므로 접근가능 
		System.out.println("Engineer의 Test 함수");
	}
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return  super.toString()+ "skill=" + skill ;
	}
}
