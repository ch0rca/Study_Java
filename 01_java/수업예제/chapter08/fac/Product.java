package chapter08.fac;

public abstract class Product {
	private boolean isOn;
	public abstract void service(Command command);
	public void power(){
		isOn= !isOn;
	}
	public boolean isOn() {
		return isOn;
	}
}









