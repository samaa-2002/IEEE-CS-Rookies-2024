import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myString = new String("hello");
        String testString = new String();
        testString = in.next();
        int i = 0;
        int j = 0;
        while (i < testString.length() && j < myString.length()) {
            if (testString.charAt(i) == myString.charAt(j)) {
                j++;
            }
            i++;
        }
        if (j == 5) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}