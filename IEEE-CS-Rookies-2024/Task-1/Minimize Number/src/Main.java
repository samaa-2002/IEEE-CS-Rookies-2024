import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int N =in.nextInt();
      int [] array=new int[N];
      int operations=Integer.MAX_VALUE;
      for (int i=0;i<N;i++) {
          array[i] = in.nextInt();
      }
        for (int i=0;i<N;i++) {
            int count =0;
          while(array[i]%2==0) {
              count++ ;
              array[i] /=2;
          }
          operations=Math.min(operations,count);
      }


        System.out.println(operations);
}
}