package week05;
import java.util.Arrays;
/*
 * 이진검색 - 자바 Arrays.binarySeearch
 */
import java.util.Scanner;

public class Ex0506 {
    public static void main(String[] args) {
        int arr[] = {5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int idx = Arrays.binarySearch(arr, key);
        System.out.println("idx == " + idx);
        // 배열에 존재하지 않는 수의 idx는 -1로 고정이 아니고 변동됨
        if(idx < 0) {
            System.out.println(String.format("존재하지 않는 수 %d", key));
        } else {
            System.out.println(String.format("%d 수는 arr[%d]에 존재", key, idx));
        }
    }
}
