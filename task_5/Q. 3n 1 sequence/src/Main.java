import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(lengthOfSequence(n, 0));
    }

    public static int lengthOfSequence(int n, int count) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = 3 * n + 1;
                count++;
            }
        }
        return count + 1;
    }
}