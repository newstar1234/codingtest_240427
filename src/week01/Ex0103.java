package week01;

public class Ex0103 {
    public static void main(String[] args) {
        int i = 10, j = 20;
        int k = -8;

        int a = i + j;
        int b = i - j;
        int c = i * j;
        int d = i / j;

        int e = i % j;

        System.out.println(String.format("%d %d", d, e));
        System.out.println(i++); // 10 출력 -> i == 11
        System.out.println(++j); // 21 출력 -> j == 21

        System.out.println(1&1); // 비트로 변환 -> & // 0001 & 0001 = 0001(1)
        System.out.println(1&2); // 비트로 변환 -> & // 0001 & 0010 = 0000(0)
        System.out.println(1|2); // 비트로 변환 -> |(or) // 0001 | 0010 = 0011(3)
    }
}


// 우선순위
// . , [] , ()
// 산술, 시프트, 비교
// 비트, 논리, 조건, 대입
