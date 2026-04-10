package chapter08.fac;
public class ProductFactory {
	public static Product getInstance() {
//		return new Phone();
		return new SmartPhone();
	}
}
