package com.ureca.model.dto;

public class Engineer extends Employee {
	private String skill;
	public Engineer() {	}
	/** 생성자는 상속되지 않기 때문에 super와 같은 인자의 생성자가 필요하다면 추가로 선언해야 한다. */
	public Engineer(String empno, String name, int salary, String skill) {
		//생성자는 상속되지 않지만  호출을 통해서 재사용은 할 수 있다. 
		super(empno, name, salary);
		setSkill(skill);
	}
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("skill=").append(skill).append("]");
		return builder.toString();
	}
}
