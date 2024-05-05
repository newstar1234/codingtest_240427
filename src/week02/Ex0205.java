package week02;

import java.util.*;

public class Ex0205 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set.size());
        
        for( String str: set) {
            System.out.println(str);
        }

        Iterator<String> iterator = set.iterator();
        
        while(iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }// 계속 반복해서 도는 것

        set.remove("A");
    }
}
