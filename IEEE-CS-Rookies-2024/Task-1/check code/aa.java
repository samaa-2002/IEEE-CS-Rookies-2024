public class aa {import java.util.Scanner;

    public class CodeValidation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input A and B
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // Input code S
            String S = scanner.next();

            // Validate the code
            String result = validateCode(A, B, S);

            // Output the result
            System.out.println(result);

            scanner.close();
        }

        private static String validateCode(int A, int B, String S) {
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

}
