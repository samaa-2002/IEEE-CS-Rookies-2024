import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int cases =in.nextInt();
        for (int i=1;i<=cases;i++){
            int noRectangles = in.nextInt();
                int X1= in.nextInt();
                int Y1= in.nextInt();
                int X2= in.nextInt();
                int Y2= in.nextInt();
                int intersecX1=X1;
                int intersecX2=X2;
                int intersecY1=Y1;
                int intersecY2=Y2;

            for(int j=1;j<noRectangles;j++) {
                X1 = in.nextInt();
                Y1 = in.nextInt();
                X2 = in.nextInt();
                Y2 = in.nextInt();
                intersecX1 = Math.max(X1, intersecX1);
                intersecY1 = Math.max(Y1, intersecY1);
                intersecX2 = Math.min(X2, intersecX2);
                intersecY2 = Math.min(Y2, intersecY2);
            }
                 if (intersecX2>intersecX1&&intersecY2>intersecY1){
                     int area=(intersecX2-intersecX1)*(intersecY2-intersecY1);
                     System.out.println("Case #"+i+": "+area);
                 }
                 else {
                     System.out.println("Case #"+i+": "+0);
                 }
            }
        }

}