package week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ2161 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.offer(i); // queue에 n 을 차례로 더해줌
        }

        while(queue.size() > 1) {
            System.out.printf("%d ", queue.poll()); // front 읽고 삭제
            queue.offer(queue.poll()); // 삭제한걸 다시 queue에 더해줌
        }
        System.out.print(queue.peek()); // 또는 queue.poll(); // peek로 읽기 삭제X

    }
}

