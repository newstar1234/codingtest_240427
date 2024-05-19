import java.util.*;

public class bj28278 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        sc.nextLine();
        for(int i = 0; i<n; i++) {
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String cmd = st.nextToken();

            switch (cmd) {
                case "1":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
            
                case "2":
                    if(stack.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(stack.pop()).append("\n");
                    break;

                case "3":
                    sb.append(stack.size()).append("\n");
                    break;

                case "4":
                    if(stack.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

                case "5":
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
