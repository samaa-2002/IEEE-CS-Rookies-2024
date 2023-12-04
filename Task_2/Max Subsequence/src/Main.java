import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String S =new String();
        String newString =new String();

        int n =in.nextInt();
        S=in.next();
        int z=1;
        for (int i=1;i<n;i++){
            char Char=S.charAt(i-1);
            char nextChar=S.charAt(i);
            if (Char!=nextChar){
                z++;
            }

        }
        System.out.println(Math.min(z,n));
    }
}