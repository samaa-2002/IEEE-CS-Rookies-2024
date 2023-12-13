
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RA = in.nextInt();
        int CA = in.nextInt();
        int[][] A = new int[RA][CA];
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CA; j++) {
                A[i][j] = in.nextInt();
            }
        }
        int RB = in.nextInt();
        int CB = in.nextInt();
        int[][] B = new int[RB][CB];
        for (int i = 0; i < RB; i++) {
            for (int j = 0; j < CB; j++) {
                B[i][j] = in.nextInt();
            }
        }
        if (CA != RB) {
            System.out.println("can not multiply this ");
            return;
        }


        int[][] result = multiplication(A, B);
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CB; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static int[][] multiplication(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int k = 0; k < B[0].length; k++) {
                for (int j = 0; j < A[0].length; j++) {
                    result[i][k] += A[i][j] * B[j][k];
                }
            }
        }
        return result;
    }
}


