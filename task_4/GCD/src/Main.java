import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();

        long gcd = calculateGCD(A, B);
        long lcm = (A * B) / gcd;

        System.out.println(gcd + " " + lcm);
    }

    public static long calculateGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
