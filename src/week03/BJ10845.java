package week03;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> queue = new LinkedList<>();
        int n = sc.nextInt(); // 전체 개수

        StringBuilder sb = new StringBuilder();
        
        sc.nextLine(); //// 안하면 제대로 입력이 안됌!!! 
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s); // 공백을 기준으로 자름
            String cmd = st.nextToken(); 
            switch(cmd) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        sb.append(1).append("\n");
                    }
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if(queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(queue.getFirst()).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(queue.getLast()).append("\n");
                    break;

                default:
                    break;
            }
        }

        System.out.println(sb.toString());

    }
}
