package week04;

import java.util.Stack;
import java.util.Arrays;

public class Ex0401 {
    public static void main(String[] args) {
        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.toString()); // stack 출력
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop(); // 가져오고 제거 O
        System.out.println(stack.toString());
        System.out.println(stack.peek()); // 가져오고 제거 X
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(4)); // 존재하는지 아닌지 확인 // 없으면 -1 출력
        System.out.println(stack.search(2));
        System.out.println(stack.contains(2)); // 포함되어있는지 아닌지 확인 // true or false
        System.out.println(stack.containsAll(Arrays.asList(1,2,4)));
        System.out.println(stack.size());
    }
}
