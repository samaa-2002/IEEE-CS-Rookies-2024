import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double X1= in.nextDouble();
        double Y1= in.nextDouble();
        double X2= in.nextDouble();
        double Y2= in.nextDouble();
        double X3= in.nextDouble();
        double Y3= in.nextDouble();
        double X4= in.nextDouble();
        double Y4= in.nextDouble();
        double XC1=((X1+X2)/2);
        double YC1=((Y1+Y2)/2);
        double XC2=((X3+X4)/2);
        double YC2=((Y3+Y4)/2);
        if(distance(XC1,YC1,XC2,YC2)<=(distance(X1,Y1,XC1,YC1)+distance(X3,Y3,XC2,YC2))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static double distance(double x1,double y1,double x2,double y2){
        return  (Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2))));
    }
}