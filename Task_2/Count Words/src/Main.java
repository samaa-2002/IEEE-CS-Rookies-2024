import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            char Char= s.charAt(i);
            if (Character.isLetter(Char)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println(count);
    }
}
