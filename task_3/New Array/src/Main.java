import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[2 * N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = in.nextInt();
        }
        C = newArray(A, B);
        printArray(C);
    }

    public static int[] newArray(int[] a, int[] b) {
        int[] C = new int[a.length + b.length];
        for (int i = 0; i < b.length; i++) {
            C[i] = b[i];
        }
        for (int i = 0; i < a.length; i++) {

            C[b.length + i] = a[i];
        }
        return C;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}