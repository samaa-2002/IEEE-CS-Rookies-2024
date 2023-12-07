import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int Y = in.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = in.nextInt();
            }
        }
        printArray(swap(A, X, Y));
    }

    public static int[][] swap(int[][] a, int x, int y) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp = a[i][x - 1];
            a[i][x - 1] = a[i][y - 1];
            a[i][y - 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            temp = a[x - 1][i];
            a[x - 1][i] = a[y - 1][i];
            a[y - 1][i] = temp;
        }
        return a;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}