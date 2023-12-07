import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N =in .nextInt();
        if (isOdd(N)&&isPalindrome(binary(N))) {
            System.out.println("YES");
        } else
        System.out.println("NO");
    }
    public static boolean isOdd (int n){
        if (n%2==0)
            return false;
        else return true;

    }
    public static boolean isPalindrome(String s) {
        int last = s.length() - 1;
        int first = 0;
        while (last > first) {
            if (s.charAt(last) != s.charAt(first)) {
                return false;
            } else {
                first++;
                last--;
            }
        }
        return true;
    }
    public static String binary (int n){
        StringBuilder s= new StringBuilder();
        if (n==0){
            s.append('0');
        }
        else while (n>0){
            int rem =n%2;
            s.insert(0,rem);
            n/=2;
        }
        return s.toString();
    }
}