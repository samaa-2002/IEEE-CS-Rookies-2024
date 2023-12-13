import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        System.out.println(NCR(A, B) + " " + NPR(A, B));

    }

    public static long fac(long num) {
        long result = 1;
        for (int i = (int) num; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static long NCR(long num1, long num2) {
        return (fac(num1)) / (fac(num2) * fac(num1 - num2));
    }

    public static long NPR(long num1, long num2) {
        return (fac(num1) / fac(num1 - num2));
    }
}