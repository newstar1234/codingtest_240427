package week01;

public interface RemoteController {
    // 상수 선언
    public static final int MAX_VOLUME = 10;
    int MIN_VLOUME = 0;

    // 추상 메소드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // 디폴트 메소드
    default void setMute(boolean mute) {
        if(mute) System.out.println("음소거");
    }

    // 정적 메소드
    static void change() {
        System.out.println("========");
    }
}

// 디폴트 / 정적 메소드는 implements 에서 구현X
// 디폴트 메소드 / 정적 메소드는 공통의 경우 사용