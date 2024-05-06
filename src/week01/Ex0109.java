package week01;

public class Ex0109 {
    public static void main(String[] args) {
        // 반복문 break label

        aa: 
        while (true) {
            for(int i = 0; i < 100; i++) {
                if(i == 10) break aa; // break label 이름을 달아줌으로써 aa 위치로 이동
                System.out.println(i);
            }
        }
        
    }
}
