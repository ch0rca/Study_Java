package chapter08;

interface TVCommand {
	static int MAX_SOUND 	= 50;
	static int VOLUME_UP 	= -10;
	static int VOLUME_DOWN 	= -20;
	static int MUTE 		= -30;
	static int CHANNEL_UP 	= -40;
	static int CHANNEL_DOWN = -50;
}
interface PhoneCommand {
	public static int CALL = 10;
	public static int PHONE_LIST = 50;
}

enum ETVCommand {
	MAX_SOUND, VOLUME_UP,VOLUME_DOWN,MUTE,CHANNEL_UP,CHANNEL_DOWN;
}

enum EPhoneCommand{
	CALL,PHONE_LIST
}
public class EnumTest {
	public static void main(String[] args) {
		//인터페이스를 통해 상수 선언시 문제점 
		if(TVCommand.MAX_SOUND == PhoneCommand.PHONE_LIST) {
			System.out.println("TV 명령과 Phone 명령이 같게 됨.");
		}
//		enum 타입이 서로 다른 경우 비교가 안됨.
//		if(ETVCommand.MAX_SOUND == EPhoneCommand.PHONE_LIST) {
//			
//		}
		
		
		EPhoneCommand comm = EPhoneCommand.PHONE_LIST;
		
		switch (comm) {
		case CALL: 
			System.out.println("전화걸기 위한 화면으로 전환");
			break;
		case PHONE_LIST:
			System.out.println("전화번호 목록을 위한 화면으로 전환");
			break;
		default:
			System.out.println("잘못된 명령입니다. ");
		}
		
	}
}
