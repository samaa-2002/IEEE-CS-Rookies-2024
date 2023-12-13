import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num1 = in.nextLong();
       long num2 = in.nextLong();
        long Q = in.nextLong();

        System.out.println(Xor(num1, num2, Q));
    }

    public static long Xor(long num1, long num2, long Q) {
       long test=Q%3;
         if (test== 1) {
           return num1;
        } else if (test == 2) {
            return num2;
        } else {
          return  (num1^num2);

        }

    }
}