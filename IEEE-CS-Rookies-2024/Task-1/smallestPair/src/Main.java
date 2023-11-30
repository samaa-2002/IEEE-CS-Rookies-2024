import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while (cases > 0) {

            int N = in.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = in.nextInt();
            }
            System.out.println(smallestPair(N, array));
            cases--;
        }

    }

    public static int smallestPair(int N, int array[]) {
        int smallestPair = Integer.MAX_VALUE;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                int sum = array[i] + array[j] + j - i;

                if (sum < smallestPair)
                    smallestPair = sum;
            }
        }
        return smallestPair;
    }
}