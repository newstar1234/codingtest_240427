package week04;
import java.util.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10828 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String cmd = st.nextToken();
            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(-1);
                    break;
                case "top":
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());                
                    break;
            
                default:
                    break;
            }
        }
    }
}
