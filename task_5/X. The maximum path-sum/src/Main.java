import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int A[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = in.nextInt();
            }
        }
        System.out.println(maxPathSum(0, 0, A));
    }

    public static int maxPathSum(int start, int end, int[][] A) {
        if (start == A.length - 1 && end == A[0].length - 1) {
            return A[start][end];
        } else if (start > A.length - 1 || end > A[0].length - 1) {
            return Integer.MIN_VALUE;
        }
        int right = maxPathSum(start, end + 1, A);
        int down = maxPathSum(start + 1, end, A);
        return A[start][end] + Math.max(right, down);
    }
}