package week05;

import java.util.Scanner;

/*
 * 이진 검색 (오름차순, 내림차순이 되어있어야 한다.)
 */
public class Ex0505 {
    public static void main(String[] args) {
        int arr[] = {5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int idx = BinSearch.binSearch(arr, key);
        if(idx == -1) {
            System.out.println(String.format("존재하지 않는 수 %d", key));
        } else {
            System.out.println(String.format("%d 수는 arr[%d]에 존재", key, idx));
        }
    }

    class BinSearch {
        static int binSearch(int[] a, int key) {
            int pl = 0; // 가장 왼쪽(첫번째 값)
            int pr = a.length -1; // 가장 오른쪽 (마지막 값)
            do {
                int pc = (pl + pr) / 2; // 가운데 값
                if(a[pc] == key) return pc;
                else if(a[pc] < key) {
                    pl = pc + 1;
                }
                else {
                    pr = pc - 1;
                }
            } while (pl <= pr);
            return -1;
        }
    }

}
