public class Ex0108 {
    public static void main(String[] args) {
        // 반복문 while, break
        while (true) {
            for(int i = 0; i < 100; i++) {
                if(i == 10) break; // for문 밖으로 나가지만 while이 계속 실행되어서 무한 반복됨.
                System.out.println(i);
            }
        }
    }
}
