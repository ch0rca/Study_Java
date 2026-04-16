package com.ureca.model.dto;

public class Manager extends Employee {
	private String position;
	public Manager() {	}
	/** 생성자는 상속되지 않기 때문에 super와 같은 인자의 생성자가 필요하다면 추가로 선언해야 한다. */
	public Manager(String empno, String name, int salary, String position) {
		//생성자는 상속되지 않지만  호출을 통해서 재사용은 할 수 있다. 
		super(empno, name, salary);
		setPosition(position);
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("position=").append(position).append("]");
		return builder.toString();
	}
}
