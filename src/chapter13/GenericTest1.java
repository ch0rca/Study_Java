package chapter13;

class Car {}
class Tv  {}

// 🔹 제네릭 클래스 선언: T, M은 타입 파라미터 — 사용 시점에 실제 타입으로 대체됨
// 🔹 관례상 대문자 한 글자 사용: T(Type), M(Model), E(Element), K(Key), V(Value)
class Product<T, M> {
    private T kind;   // 🔹 선언 시점엔 타입 미결 — 객체 생성 시 확정됨
    private M model;

    public Product() {}
    public Product(T kind, M model) {
        this.kind  = kind;
        this.model = model;
    }

    // 🔹 리턴 타입이 T → 사용 시점에 지정한 타입으로 결정됨
    //    Product<Tv, String>이면 getKind()의 리턴 타입은 Tv
    public T getKind(){ 
    	return kind; 
    }
    public void setKind(T kind){ 
    	this.kind = kind; 
    }
    public M getModel(){ 
    	return model; 
    }
    public void setModel(M model){ 
    	this.model = model; 
    }
}

public class GenericTest1 {
	public static void main(String[] args) {
		//K는 Tv로 대체, M은 String으로 대체
		// 🔹 T → Tv, M → String으로 대체 확정
        // 🔹 뒤쪽 <> (다이아몬드 연산자): Java 7부터 타입 추론으로 생략 가능
		Product<Tv, String> product1 = new Product<>();
		
		//Setter 매개값으로 반드시 Tv와 Stirng을 제공
		// 🔹 setKind에 Tv 외 다른 타입 넣으면 컴파일 에러 → 타입 안전성 보장
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		//Getter 리턴값은 Tv와 String이 됨
		// 🔹 형변환 없이 바로 Tv 타입으로 받음 — 제네릭 이전엔 (Tv) 캐스팅 필요
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		//------------------------------------------------------------------------
		//K는 Car로 대체, M은 String으로 대체
		Product<Car, String> product2 = new Product<>();
		
		//Setter 매개값으로 반드시 Car와 String을 제공
		// 🔹 T → Car, M → String으로 대체 — 같은 클래스를 다른 타입으로 재사용
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		//Getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
