package chapter06;

public class Employee {
	private String empno;
	private String name;
	private int salary;
	public Employee() {}
	public Employee(String empno, String name, int salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary < 2000000) {
			this.salary = 2000000;
		}else {
			this.salary = salary;
		}
	}
	@Override
	public String toString() {
		return "empno=" + empno + ", name=" + name + ", salary=" + salary ;
	}
}











