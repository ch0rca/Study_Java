package chapter08.fac;

public class SmartPhone extends Product{
	public void call(){
		System.out.println("스마트 폰 전화 걸기 명령 요청");
		System.out.println("\t전화 걸기 수행중....");
	}
	public void phoneList(){
		System.out.println("스마트 폰 전화번호 목록  요청");
		System.out.println("\t전화번호 목록 리스트 화면에 띄움");	
	}
	public void service(Command command) {
		PhoneCommand com = (PhoneCommand) command;
		if(isOn()){
			switch (com) {
			case CALL:					call();				break;
			case PHONE_LIST:		phoneList();	break;
			default:
				break;
			}
		}
	}
}






