import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
           long N = in.nextLong();
            if (canReach(N, 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean canReach(long num, long value) {
        if (value == num) {
            return true;
        }
        if (value < num) {

            return (canReach(num, value * 10) || canReach(num, value * 20));
        }
        return false;
    }
}