package week05;

import java.util.Map;
import java.util.TreeMap;

public class Ex0503 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "홍길동");
        scores.put(98, "이몽룡");
        scores.put(75, "성춘향");
        scores.put(95, "홍길순");
        scores.put(90, "변학도");

        Map.Entry<Integer,String> score = null;
        score = scores.firstEntry();
        System.out.println("가장 낮은 점수 : " + score.getKey() + " (" + score.getValue() + ")");
        
        score = scores.lastEntry();
        System.out.println("가장 높은 점수 : " + score.getKey() + " (" + score.getValue() + ")");
        
        score = scores.lowerEntry(88);
        System.out.println("88점 아래 점수 : " + score.getKey() + " (" + score.getValue() + ")");
        
        score = scores.higherEntry(88);
        System.out.println("88점 위 점수 : " + score.getKey() + " (" + score.getValue() + ")");

        score = scores.floorEntry(88);
        System.out.println("88이거나 바로 아래 점수 : " + score.getKey() + " (" + score.getValue() + ")");

        score = scores.ceilingEntry(88);
        System.out.println("88이거나 바로 위 점수 : " + score.getKey() + " (" + score.getValue() + ")");

        while (!scores.isEmpty()) {
            score = scores.pollLastEntry();
            System.out.println(score.getKey() + " (" + score.getValue() + ") - " + scores.size());
        }
    }
}

/*
 * 3. TreeMap
 *      이진 트리를 기반으로 한 Map 컬렉션
 */
