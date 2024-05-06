package week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex0204 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        long st;
        long et;
        
        st = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        et = System.nanoTime();
        System.out.println("ArrayList 걸린시간 : " + (et - st) + "ns");
        
        st = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        et = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (et - st) + "ns");
    }    
}

// 목록은 대부분 ArrayList
// 속도는 LinkedList가 빠름