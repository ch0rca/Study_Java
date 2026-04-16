package chapter08;

interface TVCommand {
    // ⚠️ 인터페이스 상수의 문제: 값이 정수이므로 다른 도메인 상수와 == 비교가 가능
    static int MAX_SOUND    = 50;
    static int VOLUME_UP    = -10;
    static int VOLUME_DOWN  = -20;
    static int MUTE         = -30;
    static int CHANNEL_UP   = -40;
    static int CHANNEL_DOWN = -50;
}
interface PhoneCommand {
    public static int CALL       = 10;
    public static int PHONE_LIST = 50;  // ⚠️ TVCommand.MAX_SOUND와 값이 같음!
}

// 🔹 enum: 열거형 — 타입 안전한 상수 집합
// 🔹 내부적으로 Enum 클래스를 자동 상속받는 특수 클래스
enum ETVCommand   { MAX_SOUND, VOLUME_UP, VOLUME_DOWN, MUTE, CHANNEL_UP, CHANNEL_DOWN }
enum EPhoneCommand { CALL, PHONE_LIST }

public class EnumTest {
    public static void main(String[] args) {

        // ⚠️ 인터페이스 상수의 치명적 문제: 다른 도메인인데 값이 같으면 true!
        if (TVCommand.MAX_SOUND == PhoneCommand.PHONE_LIST) {
            System.out.println("TV 명령과 Phone 명령이 같게 됨.");  // 🖨️ 출력됨!
        }

//      if (ETVCommand.MAX_SOUND == EPhoneCommand.PHONE_LIST) { }
        // ✅ enum끼리는 타입이 달라 == 비교 자체가 컴파일 에러 → 잘못된 비교 원천 차단

        EPhoneCommand comm = EPhoneCommand.PHONE_LIST;

        // 🔹 enum을 switch에서 사용 — case에 enum 상수명만 쓰면 됨
        switch (comm) {
        case CALL:
            System.out.println("전화걸기 위한 화면으로 전환");
            break;
        case PHONE_LIST:
            System.out.println("전화번호 목록을 위한 화면으로 전환");  // 🖨️ 출력
            break;
        default:
            System.out.println("잘못된 명령입니다.");
        }
    }
}