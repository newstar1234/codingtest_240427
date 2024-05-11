package week03;

import java.util.LinkedList;
import java.util.Scanner;

public class BJ1021 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 큐에 담길 수 개수
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int m = sc.nextInt(); // 두번째 줄에 입력받을 수 개수

        int count = 0;


        int[] seq = new int[m]; // 뽑을 수를 담은 배열
        for(int i = 0; i < m; i++) {
            seq[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            int target = queue.indexOf(seq[i]);
            int half_index; // 중간
            if(queue.size() % 2 == 0) {
                half_index = queue.size() / 2 -1;
            }
            else {
                half_index = queue.size() / 2;
            }

            if(target <= half_index) {
                for(int j = 0; j < target; j++) {{
                    int temp = queue.pollFirst();
                    queue.offerLast(temp);
                    count++;
                }}
            }
            else {
                for(int j = 0; j < queue.size() - target; j++) {
                    int temp = queue.pollLast();
                    queue.offerFirst(temp);
                    count++;
                }
            }
            queue.pollFirst();

        }

        System.out.println(count);
    }
}
