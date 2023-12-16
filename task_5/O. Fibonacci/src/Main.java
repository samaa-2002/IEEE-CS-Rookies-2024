import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        System.out.println(fibonacci(num));

    }
    public static long fibonacci(int n){
        if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}