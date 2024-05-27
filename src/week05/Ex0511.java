package week05;
/*
 * 단순선택정렬
 */
public class Ex0511 {
    public static void main(String[] args) {
        int x[] = {6, 4, 8, 3, 1, 9, 7};
        selectionSort(x);

    }

    static void selectionSort(int a[]) {
        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, i, min);
            for(int k = 0; k < a.length; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
    
    static void swap(int a[], int m, int n) {
        int tmp = a[n];
        a[n] = a[m];
        a[m] = tmp;
    }
}
