import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        printNumbers(1, N);
    }

    public static void printNumbers(int start, int num) {
        if (start <= num) {
            System.out.println(start);
            printNumbers(start + 1, num);

        }
    }
}