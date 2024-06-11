package week05;
/*
 * 퀵 정렬
 * 이진 탐색과 유사
 */
public class Ex0513 {
    public static void main(String[] args) {
        int x[] = {6, 4, 8, 3, 1, 9, 7};
        quickSort(x, 0, x.length - 1);
    }

    static void quickSort(int a[], int l, int r) {
        int pl = l;
        int pr = r;
        int pc = (pl + pr) / 2;
        do{
            while (a[pl] < a[pc]) pl++;
            while (a[pr] > a[pc]) pr--;

            if(pl <= pr) {
                swap(a, pl++, pr--);
            }

        } while(pl <= pr);

        if(l < pr) quickSort(a, l, pr);
        if(r > pl) quickSort(a, pl, r);

        for(int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }

    static void swap(int a[], int m, int n) {
        int tmp = a[n];
        a[n] = a[m];
        a[m] = tmp;
    }
}
