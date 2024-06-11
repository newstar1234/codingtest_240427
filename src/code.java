import java.util.*;

public class code {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int n = 0;

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            n = arr[i];
            if(n % divisor == 0) {
                for(int j = 0; j < arr.length; j++) {
                    
                }
            }
            else if(n % divisor != 0) {
                return new int[]{-1};
            }
        }

        return answer;
    }
}
