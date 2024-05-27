package week05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex0502 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        NavigableSet<Integer> desc = scores.descendingSet(); // 내림차순
        for(Integer score : desc) {
            System.out.print(score + " ");
        }
        System.out.println();

        NavigableSet<Integer> asc = desc.descendingSet(); // 오름차순
        for(Integer score : asc) {
            System.out.print(score + " ");
        }

    }
}
