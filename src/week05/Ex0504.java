package week05;

import java.util.Scanner;

public class Ex0504 {
    public static void main(String[] args) {
        int arr[] = {6, 4, 8, 3, 2, 1};
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 수 : ");
        int key = sc.nextInt();
        int idx = SequenceSearch.sequenceSearch(arr, key);
        if(idx == -1) {
            System.out.println(String.format("존재하지 않는 수 %d", key));
        } else {
            System.out.println(String.format("%d 수는 arr[%d]에 존재", key, idx));
        }
    }

    class SequenceSearch {
        static int sequenceSearch(int[] a, int key) {
            for(int i = 0; i < a.length; i++) {
                if(a[i] == key) return i;
            }
            return -1;
        }
    }

}

/*
 * 4. 선형검색과 이진검색
 *      - 선형검색
 *      요소가 직선 모양으로 늘어선 배열에서 원하는 키값을 갖는 요소를 만날 때까지 맨 앞부터 순서대로 요소를 검색하는 알고리즘
 * 
 *      - 이진검색
 *      요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘
 */