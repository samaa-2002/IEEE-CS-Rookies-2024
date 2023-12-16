import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        double average = average(0, A, 0);
        System.out.printf("%.6f%n", average);
    }

    public static double average(int start, int[] array, double sum) {

        if (start < array.length) {
            sum += array[start];
            return average(start + 1, array, sum);
        }
        return sum / array.length;
    }

}