import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int X = in.nextInt();
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        shiftRight(A, X);
    }

    public static void shiftRight(int[] a, int x) {
        int shift = x % a.length;
        for (int i = 1; i <= shift; i++) {
            System.out.print(a[a.length - shift + i - 1] + " ");
        }
        for (int i = 0; i < a.length - shift; i++) {
            System.out.print(a[i] + " ");
        }

    }
}