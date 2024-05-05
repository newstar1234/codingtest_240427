package week01;

public class Ex0110 {
    public static void main(String[] args) {
        // 반복문 continue
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) continue; // 짝수면 continue니깐 다시 for로 감
            System.out.println(i); // 홀수만 출력
        }

        for(int i = 2; i <= 100; i+=2) {
            System.out.println(i); // 짝수만 출력
        }
    }
}
