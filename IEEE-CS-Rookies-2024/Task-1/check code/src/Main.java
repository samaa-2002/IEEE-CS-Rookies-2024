import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        String S = in.next();

        System.out.println(validateCode(A, B, S));
    }
        private static String validateCode(int A, int B, String S){
            // Check if the length of S is valid
            if (S.length() != A + B + 1) {
                return "No";
            }

            // Check if position A + 1 has the symbol '-'
            if (S.charAt(A) != '-') {
                return "No";
            }

            // Check if all other characters are digits
            for (int i = 0; i < A + B + 1; i++) {
                if (i != A && !Character.isDigit(S.charAt(i))) {
                    return "No";
                }
            }

            return "Yes";
        }
    }
