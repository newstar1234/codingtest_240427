package week02;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex0203 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        System.out.println(list.toString() + " , " + list.size()); // 리스트의 개수
        list.add("B");
        list.add("C");
        System.out.println(list.toString() + " , " + list.size());
        list.add(2, "D"); // 인덱스 번호에 삽입
        System.out.println(list.toString() + " , " + list.size());
        list.add("C");
        System.out.println(list.toString() + " , " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.println("문자 : " + list.get(i));            // 리스트 가져오기
        }
        for(String str : list) {
            System.out.println("문자 : " + str);                    // 리스트 가져오기
        }

        list.remove(2); // 인덱스 번호 삭제
        list.remove("C"); // 처음 만난 object "C" 삭제

        List<String> rlist = new ArrayList<String>(Arrays.asList("C")); //Arrays.asList 배열을 리스트로 바꿔줌.
        list.removeAll(rlist); // "C" 전부 삭제
        System.out.println(list.toString() + " , " + list.size());
    }
}
        
// List<자료형> -> 자료형은 class로 