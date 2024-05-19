package week03;

import java.util.LinkedList;
import java.util.Scanner;

public class BJ1021 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int count = 0; // 구하려는 데이터

        int n = sc.nextInt(); // 큐에 담길 수 개수
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int m = sc.nextInt(); // 두번째 줄에 입력받을 수 개수
        int[] arr = new int[m]; // 입력받은 m 을 담을 배열
        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextInt(); 
        }

        // arr에 담김 숫자만큼만 반복
        for(int num : arr) {
            int idx = queue.indexOf(num); // 찾으려는 수의 위치
            int half = queue.size() / 2;
            
            if(idx < half) {
                // num 이 제일 앞에있는 숫자와 같지 않으면 반복 
                while(num != queue.getFirst()) { 
                    // idx가 왼쪽이면 젤 앞의 수를 지우고 맨 뒤에 넣어주기 // 2번
                    queue.addLast(queue.removeFirst());
                    count++;
                }
            }
            else {
                // 3번
                while(num != queue.getFirst()) {
                    queue.addFirst(queue.removeLast());
                    count++;
                }
            }
            // 1번
            queue.poll();
        }
        System.out.println(count);

    }
}
