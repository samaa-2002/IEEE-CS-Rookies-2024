import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();


        for (int t = 1; t <= cases; t++) {
            int N = in.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
            for (int i = 0; i < N; i++) {
                int max = array[i];
                for (int j = i + 1; j < N; j++) {
                    max = Math.max(max, array[j]);
                    System.out.print(max + " ");

                }

            }

            System.out.println();

        }


    }

}
    