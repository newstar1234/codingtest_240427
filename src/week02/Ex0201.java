package week02;

import java.util.Scanner;

public class Ex0201 {
    public static void main(String[] args) {
        // 최대값 만들기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 : ");
        int a = sc.nextInt();        
        
        System.out.println("두 번째 숫자 : ");
        int b = sc.nextInt();        
        
        System.out.println("세 번째 숫자 : ");
        int c = sc.nextInt();        

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.printf("최대값 %d", max);
    }
}

// 첫번째 / 배열의 첫번째를 일단 최대값, 최소값으로 정함