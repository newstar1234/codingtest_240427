package week01;

public class Ex0112 {
    public static void main(String[] args) {
        // 구구단
        for(int i = 1; i < 10; i++ ) {
            for(int j = 2; j < 10; j++) {
                // System.out.printf("%d * %d = %d  ", j, i, (i*j));    // 정렬X
                System.out.printf("%d * %d = %2d  ", j, i, (i*j));   // 정렬O -> 2자리 -> 오른쪽 정렬
                // System.out.printf("%d * %d = %-2d  ", j, i, (i*j));  // 정렬O -> 2자리 -> 왼쪽 정렬
                // System.out.printf("%d * %d = %02d  ", j, i, (i*j));  // 정렬O -> 2자리 -> 빈 자리 0으로
            }
            System.out.println();
        }
    }
}

