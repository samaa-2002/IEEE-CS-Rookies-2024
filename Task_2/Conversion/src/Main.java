import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = new String();
        S = in.next();
        for (int i = 0; i < S.length(); i++) {
            char Char = S.charAt(i);
            if (Char == ',') {
                Char = ' ';
            } else if (Char >= 'A' && Char <= 'Z') {
                Char += 32;

            } else if (Char >= 'a' && Char <= 'z') {
                Char -= 32;

            }
            System.out.print(Char);
        }

    }
}