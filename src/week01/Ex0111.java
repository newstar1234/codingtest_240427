package week01;

public class Ex0111 {
    public static void main(String[] args) {
        // 구구단 // 행 * 열 // i * j
        for(int i = 2; i < 10; i++ ) {
            for(int j = 1; j < 10; j++) {
                System.out.println(String.format("%d * %d = %d", i, j, i*j));
            }
            System.out.println();
        }
    }
}
