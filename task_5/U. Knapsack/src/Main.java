import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();
        int[] weights = new int[N];
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }
        int result = knapSack(W, N, weights, values);
        System.out.println(result);
    }

    public static int knapSack(int W, int N, int[] weights, int[] values) {
        if (W == 0 || N == 0) {
            return 0;
        }
        if (weights[N - 1] > W) {
            return knapSack(W, N - 1, weights, values);
        }

        return Math.max(values[N - 1] + knapSack(W - weights[N - 1], N - 1, weights, values),
                knapSack(W, N - 1, weights, values));

    }
}