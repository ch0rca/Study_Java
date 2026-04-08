package chapter07;

public class Engineer extends Employee {
	private String skill;
	public Engineer() {	}
	public Engineer(String empno, String name, int salary, String skill) {
		super(empno, name, salary);
		this.skill = skill;
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
