package week03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0302 {
    public static void main(String[] args) {
        /*
         * 배열로 큐 만들기
         * Scanner 입력 0을 누르면 종료
         * 
         */
        Scanner sc = new Scanner(System.in);
        ArrayQueue queue = new ArrayQueue(5); // 배열 큐 선언
        
        while(true) {
            System.out.println(String.format("현재 수 : %d / %d", queue.size(), queue.capacity()));
            System.out.println("1. enq(add), 2. deq(poll), 3. peek, 4. clear, 5. dump, 0. exit");
            int num = sc.nextInt();
            if(num == 0) {
                System.exit(0);
                break;
            }

            int x;
            switch(num) {
                case 1:
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    queue.add(x);
                    break;
                case 2:
                    x = queue.poll();
                    System.out.printf("나간 데이터 : %d\n", x);
                    break;
                case 3:
                    x = queue.peek();
                    System.out.printf("첫번째 데이터 : %d\n", x);
                    break;
                case 4:
                    queue.clear();
                    break;
                case 5:
                    queue.dump();
                    break;
            }
        }
    }
}

class ArrayQueue {
    private int max;        // 최대용량
    private int front;      // 첫번째 요소의 커서
    private int rear;       // 마지막 요소의 커서
    private int cnt;        // 데이터 수 
    private int[] queue;    // 큐

    public ArrayQueue(int capacity) {
        this.max = capacity;
        this.front = this.rear = this.cnt = 0;
        try {
            this.queue = new int[this.max];
        } catch (Exception e) {
            this.max = 0;
        }
    }

    public int add(int x) {
        if(cnt >= max) {
            System.out.println("Queue is Full");
            return x;
        }
        queue[rear++] = x;
        cnt++;
        if(rear == max) rear = 0;

        return x;
    }

    public int peek() {
        if(cnt <= 0) System.out.println("Queue is Empty!");
        return queue[front];
    }

    public int poll() {
        if(cnt <= 0) {
            System.out.println("Queue is Empty!");
            return 0;
        }
        int x = queue[front++];
        cnt--;
        if(cnt < 0) cnt = 0;
        if(front == max) front = 0;
        
        return x;
    }

    public void clear() {
        this.front = this.rear = this.cnt = 0;
    }

    public boolean isEmpty() {
        return cnt <= 0;
    }

    public boolean isFull() {
        return cnt == max;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return cnt;
    }

    public void dump() {
        if(cnt <= 0) System.out.println("Queue is Empty!");
        else System.out.println(Arrays.toString(queue));
    }

}

// cnt는 카운트