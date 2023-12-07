import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        //  if (X>=1&&X<=10&&N>=1&&N<=10) {
        long sum = 0;
        for (int i = 2; i <= N; i += 2) {
            sum += power(X, i);
        }
        System.out.println(sum);
        // }
    }

    public static long power(int x, int n) {
        if (n == 0)
            return 1;
        long s = 1;
        for (int i = 0; i < n; i++)
            s = s * x;
        return s;
    }
}