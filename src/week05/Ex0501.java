package week05;

import java.util.TreeSet;

public class Ex0501 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        System.out.println(scores.toString());

        Integer score = null;
        score = scores.first(); // 가장 낮은 수
        System.out.println("가장 낮은 점수 : " + score);
 
        score = scores.last(); // 가장 높은 수
        System.out.println("가장 높은 점수 : " + score);
        
        score = scores.lower(95);
        System.out.println("95점 아래 점수 : " + score);
        
        score = scores.higher(95);
        System.out.println("95점 위 점수 : " + score);
        
        score = scores.floor(94);
        System.out.println("95점이거나 바로 아래 점수 : " + score);
        
        score = scores.ceiling(94);
        System.out.println("95점이거나 바로 위 점수 : " + score);
        
        // 인덱스가 없기때문에 for반복문 사용이 어려움
        
        while(!scores.isEmpty()) {
            score = scores.pollFirst();
            System.out.println(score + " (남은 객체 수 : " + scores.size() + ")");
        }
    }
}

/*
 * Heap 영역
 * 1. 메소드 영역
 *      코드에서 사용되는 클래스(class)들을 클래스 로더로 읽어 클래스 별로 분류해서 저장
 * 2. 힙(Heap) 영역
 *      객체와 배열이 생성되는 영역
 * 3. JVM 스택(stack) 영역
 *      각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당
 * 
 *  Tree
 * 1. 이진트리 구조
 *      binary tree 는 여러 개의 노드가 트리 형태로 연결된 구조
 * 
 * 2. TreeSet
 *      이진 트리를 기반으로 한 Set 컬렉션
 * 
 */

