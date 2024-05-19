public class code {
    public static void main(String[] args) {
        
        int[] sides = new int[]{11,7};
        int answer = 0;
        int n = 0;
        int m = 0;
        for(int i = 0; i < sides.length; i++) {
            n += sides[i];
            m -= sides[i];
        }
        System.out.println(n);
        System.out.println(m);
        answer = n - m - 1;

        System.out.println(answer);
        
    }
}
