import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

            if (test == 1) {
                String number = in.next();
                int base = in.nextInt();
                long result=convertToDecimal(number,base);
                System.out.println(result);
            } else if (test == 2) {
               long number = in.nextLong();
                int base = in.nextInt();
                String result=convertToBase(number,base);
                System.out.println(result);

        }
    }

    public static long convertToDecimal(String num, int base) {
        int n = 0;
        long convertedNumber = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
           char digit=num.charAt(i);
            int Value ;
            if (Character.isDigit(digit)) {
                Value = digit - '0';
            } else {
                Value =  digit - 'A'+10 ;
            }
            convertedNumber += Value * Math.pow(base, n);
            n++;
        }
        return convertedNumber;
    }

    public static String convertToBase(long num, int base) {
        StringBuilder s = new StringBuilder();

        while (num > 0) {
            char digit;
            long reminder = num % base;
            if (reminder >= 10) {
                digit = (char) (reminder - 10 + 'A');
            } else {
                digit = (char) (reminder + '0');
            }
            s.insert(0, digit);
            num /= base;
        }
        return s.toString();
    }
}
