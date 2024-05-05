package week01;

public class Ex0117 {
    public static void main(String[] args) {
        // 2차원 배열
        int[][] a;
        int b[][];
        int[] c[];

        int d[][] = {{1,2}, {3,4}, {5,6}}; // 3행 2열 
        d = new int[][] {{7,8}, {9,10}, {11,12,13}};

        d = new int[3][2]; // 3행2열
        d = new int[3][]; // 3행 가변열
        d[0] = new int[10]; // 1행 10열 // 첫번째행은 열번째 행으로
        d[1] = new int[2]; // 1번 배열 2개의 열로 구성
    }
}
