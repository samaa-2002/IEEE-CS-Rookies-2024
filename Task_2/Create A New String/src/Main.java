import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String S = new String();
        String T = new String();
        Scanner in = new Scanner(System.in);
        S = in.next();
        T = in.next();
        System.out.print(S.length());
        System.out.println(" " + T.length());
        System.out.print(S + " " + T);
    }
}