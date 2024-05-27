import java.util.LinkedList;
import java.util.Scanner;

public class bj1966 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int test = sc.nextInt();

        for(int i = 0; i < test; i++) {
            int doc = sc.nextInt();
            int idx = sc.nextInt();

            LinkedList<int[]> queue = new LinkedList<>();
            for(int j = 0; j < doc; j++) {
                // queue에 doc만큼 돌면서 넣어줌 ex.0,1,2,3 ...
                queue.offer(new int[] {j, sc.nextInt()});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] front = queue.poll(); // 첫번째 
                boolean isMax = true; // 첫번째가 가장 큰지 아닌지 확인

                for(int k = 0; k < queue.size(); k++) {
                    if(front[1] < queue.get(k)[1]) {
                        queue.offer(front);
                        isMax = false;
                        break;
                    }
                }
                if(isMax == false) continue;
                
                count++;
                if(front[0] == idx) break;
            }
            sb.append(count).append("\n");
        }
        System.out.printf("%s", sb);
    }
}
