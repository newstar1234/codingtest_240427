package week03;

import java.util.Scanner;
import java.util.LinkedList;

public class BJ1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt(); // 테스트 케이스 수
        for(int i =0; i < test; i++) {
            // 문서수
            int doc = sc.nextInt();

            // 인덱스 번호
            int idx = sc.nextInt();
            
            // 큐에 배열번호와 중요도 저장
            LinkedList<int[]> queue = new LinkedList<>();
            for(int j = 0; j < doc; j++) {
                queue.offer(new int[] {j, sc.nextInt()});
            }
            // 출력수
            int count = 0;

            while(!queue.isEmpty()) {
                // 큐에서 데이터를 가져오기
                int[] q = queue.poll();
                boolean isMax = true;

                for(int k = 0; k < queue.size(); k++) {
                    if(q[1] < queue.get(k)[1]) {
                        queue.offer(q);
                        isMax = false;
                        break;
                    }
                }
                if(!isMax) continue;

                count++;
                if(idx == q[0]) break;
            }
            System.out.println(count);
        }
    }
}
