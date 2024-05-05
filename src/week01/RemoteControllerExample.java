package week01;

public class RemoteControllerExample {
    public static void main(String[] args) {
        RemoteController rc = null;
        rc = new Radio(); // 다형성
        rc = new Television();
    }
}
