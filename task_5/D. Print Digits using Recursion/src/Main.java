import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int t = 1; t <= cases; t++) {
            String num = in.next();
            printDigits(0, num);
            System.out.println();
        }

    }

    public static void printDigits(int start, String n) {
        if (start < n.length()) {
            System.out.print(n.charAt(start) + " ");
            printDigits(start + 1, n);
        }
    }
}