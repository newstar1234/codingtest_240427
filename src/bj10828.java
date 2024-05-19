
import java.util.Stack;
import java.util.Scanner;

public class bj10828 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        sc.nextLine();
        for(int i = 0; i < n; i++){
            String cmt = sc.nextLine();
            
            switch (cmt) {
                case "push":
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
            
                case "pop":
                    sb.append(stack.pop()).append("\n");

                    if(stack.isEmpty()) sb.append(-1).append("\n");

                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    if(stack.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

                case "top":
                    sb.append(stack.peek()).append("\n");
                    if(stack.isEmpty()) sb.append(-1).append("\n");
                    break;

                default:
                    break;
            }
            
        }    
        System.out.println(sb);   
    }
}
