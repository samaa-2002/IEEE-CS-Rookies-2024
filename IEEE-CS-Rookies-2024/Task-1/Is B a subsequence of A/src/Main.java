import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < M; i++) {
            B[i] = in.nextInt();
        }
        int z = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == B[z]) {
                count++;
                z++;
            }
        }
        if (count == M)
            System.out.println("YES");
        else System.out.println("NO");
    }
}