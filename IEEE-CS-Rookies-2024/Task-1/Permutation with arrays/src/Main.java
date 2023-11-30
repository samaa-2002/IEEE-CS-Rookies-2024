import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = in.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        boolean isPermutation = true;
        for (int i = 0; i < N; i++) {
            if (A[i] != B[i])
                isPermutation = false;
        }
        if (isPermutation)
            System.out.println("yes");
        else System.out.println("no");
    }
}
