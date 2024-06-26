
import java.util.*;

public class bj10828 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s); // 이걸 사용해서 push 123 이렇게 입력이 가능함
            String cmd = st.nextToken();
            
            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
            
                case "pop":
                    if(stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.pop()).append("\n");
                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    if(stack.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

                case "top":
                    if(stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.peek()).append("\n");
                    break;

                default:
                    break;
            }
            
        }    
        System.out.println(sb);   
    }
}
