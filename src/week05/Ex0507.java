package week05;

import java.util.Scanner;

/*
 * 버블정렬
 */
public class Ex0507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("버블정렬 전");
        System.out.print("개수 : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        // 알고리즘
        bubbleSort(x, n);

        System.out.println("버블정렬 후");
        for(int i = 0; i < n; i++) {
            System.out.println(String.format("x[%d] = %d", i, x[i]));
        }
    }

    static void bubbleSort(int a[], int n) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    // 스왑 swap
                    swap(a, i, j);
                }
            }
        }
    }

    static void swap(int a[], int m, int n) {
        int tmp = a[n];
        a[n] = a[m];
        a[m] = tmp;
    }
}

/*
 * 정렬
 * 1. 대소 관계에 따라 데이터 집합을 일정한 순서로 나열하는 작업
 * 2. 내부 정렬과 외부 정렬
 * 3. 정렬 알고지름의 핵심요소 - 교환, 선택, 삽입
 * 
 * 버블정렬
 *      이웃한 두 요소의 대소 관계를 비교하고 필요에 따라 교환을 반복하는 알고리즘
 * 단순선택정렬
 *      가장 작은 요소를 맨 앞으로 이동하고, 두번째 작은 요소는 맨 앞에서 두번째로 이동하는 등의 작업을 반복하는 알고리즘
 * 단순삽입정렬
 *      선택한 요소를 그보다 더 앞 쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬하는 알고리즘
 * 퀵정렬
 *      가장 빠른 정렬 알고리즘 중 하나로 널리 사용
 */
