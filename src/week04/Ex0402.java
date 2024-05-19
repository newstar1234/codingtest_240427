package week04;
import java.util.Scanner;

public class Ex0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 용량(최대값)
        ArrayStack stack = new ArrayStack(n);
        while (true) {
            System.out.println(String.format("현재 수 : %d / %d", stack.size(), stack.capacity()));
            System.out.println("1. push, 2. pop, 3. peek, 4. clear, 5. dump, 0. exit : ");
            int num = sc.nextInt();
            if(num == 0) break;

            int x; // push, peek, pop 받을 변수
            switch (num) {
                case 1: // push
                    System.out.print("Push : ");
                    x = sc.nextInt();
                    stack.push(x);
                    break;
                case 2: // pop
                    x = stack.pop();
                    System.out.println(String.format("Pop : %d", x));
                    break;
                case 3: // peek
                    x = stack.peek();
                    System.out.println(String.format("Peek : %d", x));
                    break;
                case 4: // clear
                    stack.clear();
                    break;
                case 5: // dump
                    stack.dump();
                    break;
        
                default:
                    break;
            }
        }
    }
}

class ArrayStack {
    private int top;
    private int capacity;
    private int stack[];

    public ArrayStack(int max) {
        this.top = -1;
        this.capacity = max;
        stack = new int[max];
    }
    
    public void push(int n) {
        if(isFull()) {
            System.out.println("Stack is Full!");
        } 
        else {
            stack[++top] = n;
        }
    }

    public int peek() {
        if(isEmpty())  {
            System.out.println("Stack is Empty!!");
            return 0;
        }
        
        return stack[top];
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        else {
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top >= this.capacity -1);
    }

    public void clear() {
        // 초기화
        this.top = -1;
        stack = new int[this.capacity];
    }

    public int size() {
        return this.top + 1;
    }

    public int capacity() {
        return this.capacity;
    }

    public void dump() {
        for(int n : stack) {
            System.out.printf("%d ", n);
        }
    }

}
