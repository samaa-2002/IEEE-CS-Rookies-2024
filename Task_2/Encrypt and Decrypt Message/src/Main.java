import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        String s= new String();
        String original = new String( "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        String key = new String("PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/");
        int Q =in.nextInt();
        s=in.next();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char y =s.charAt(i);
            if (Q==1) {

                   int  j = original.indexOf(y);
                    char ke = key.charAt(j);
                   result.append(ke);

            }
         else{

               int  j=key.indexOf(y);
                 char ori=original.charAt(j);
                result.append(ori);


            }

        }
        System.out.println(result);
    }
}