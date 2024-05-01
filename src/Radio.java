public class Radio implements RemoteController {
    private int volume = 0;

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOn'");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
    }

    @Override
    public void setVolume(int volume) {
        // TODO Auto-generated method stub
        if(volume > RemoteController.MAX_VOLUME)  { // 매개변수 volume
            this.volume = RemoteController.MAX_VOLUME; // Radio의 volume
        }
    }
}


// Override -> 재사용 / 재정의
// 오버로드 -> 메소드 이름 같으나 매개변수가 다를 경우
