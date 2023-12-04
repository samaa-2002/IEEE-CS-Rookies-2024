import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String S =new String();
        int cases= in.nextInt();
        for(int t=1;t<=cases;t++){
            S = in.next();
            boolean isGood=false;
            for(int i=1;i<S.length()-1;i++){
                if((S.charAt(i-1)=='0'&&S.charAt(i)=='1'&&S.charAt(i+1)=='0')||(S.charAt(i-1)=='1'&&S.charAt(i)=='0'&&S.charAt(i+1)=='1')) {
                   isGood=true;
                    break;

                }


            }
            if (isGood) {
                System.out.println("Good");
            }else {
                System.out.println("Bad");
            }

        }
    }
}