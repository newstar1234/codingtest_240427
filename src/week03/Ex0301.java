package week03;

import java.util.Queue;
import java.util.LinkedList;

public class Ex0301 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);     
        queue.offer(2);     
        queue.offer(3);
        System.out.println(queue.toString());   
        
        System.out.println(queue.peek()); // 1을 읽어오고 삭제는 하지않음
        System.out.println(queue.toString());   
        System.out.println(queue.poll()); // 1을 읽어오고 삭제함
        System.out.println(queue.toString());  
        System.out.println(queue.isEmpty()); // false
        queue.clear(); // 전체 삭제 
        System.out.println(queue.toString());  
    }
}

// Queue