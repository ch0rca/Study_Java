package chapter08.sub;

public interface Trans {
	int INIT = 10;			//컴파일시 public static final이 추가됨.
	void start();			//컴파일시 public abstract가 추가됨. 
	void stop();			//컴파일시 public abstract가 추가됨. 
}
