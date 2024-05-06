package week02;

public class Ex0202 {
    public static void main(String[] args) {
        System.out.println(MaxMin.max(10, 3, 5));
        System.out.println(MaxMin.max(100, 200, 300));
        System.out.println(MaxMin.max(1, 2, 3));

        int a[] = {1,4,23,6,3,76,34,8,3,9,3};
        System.out.println(MaxMin.max(a));
        System.out.printf("최대값 %d, 최소값 %d", MaxMin.maxmin(a)[0], MaxMin.maxmin(a)[1]);
    }
}

class MaxMin {
    static int max(int a, int b, int c) {
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;

        return max;
    }
    
    static int max(int[] arr) {
        // arr[0] 에 값이 없을 경우도 있음
        if(arr.length == 0) return 0;
        int max = arr[0];
        for(int n : arr) {
            if(max < n) max = n;
        }

        return max;
    }

    static int[] maxmin(int[] arr) {
        int[] maxmin = new int[2];
        if(arr.length == 0) {
            return maxmin;
        }
        // 1
        int max = arr[0];
        int min = arr[0];
        for(int n : arr){
            if(max < n) max = n;
            if(min > n) min = n;
        }
        maxmin[0] = max;
        maxmin[1] = min;

        // 2
        // maxmin[0] = arr[0]; // 최대값
        // maxmin[1] = arr[1]; // 최소값
        // for(int n : arr) {
        //     if(maxmin[0] < n) maxmin[0] = n;
        //     if(maxmin[1] > n) maxmin[1] = n;
        // }

        return maxmin;
    }
}
