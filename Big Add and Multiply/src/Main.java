import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.next();
        BigInteger num = new BigInteger(N);
        BigInteger sum = num.add(BigInteger.valueOf(9999));
        BigInteger multiplication = num.multiply(BigInteger.valueOf(9999));
        System.out.println(sum);
        System.out.println(multiplication);
    }
}