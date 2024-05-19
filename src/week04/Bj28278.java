package week04;
import java.util.*;

public class Bj28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            int cmd = Integer.parseInt(st.nextToken());
            switch (cmd) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case 5:
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
            
                default:
                    break;
            }
        }
    }
}
