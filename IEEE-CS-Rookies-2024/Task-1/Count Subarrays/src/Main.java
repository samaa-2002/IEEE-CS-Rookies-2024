import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int cases= in.nextInt();


        for (int t=1;t<=cases;t++){
            int N= in.nextInt();
            int [] array =new int[N];
            int count=0;
            for (int i=0;i<N;i++){
                array[i]= in.nextInt();
            }
            for (int i=0;i<N;i++){
                count++;
                for(int j=i+1;j<N;j++){
                    if(array[j]>array[j-1])
                        count++;
                    else break;
                }
            }
            System.out.println(count);
        }
    }
}