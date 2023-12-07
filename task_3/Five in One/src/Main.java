import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int primeNumbers = 0;
        int palindromeNumbers = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            if (isPrime(A[i])) {
                primeNumbers++;
            }
            if (isPalindrome(A[i])) {
                palindromeNumbers++;
            }


        }
        System.out.println("The maximum number : " + max(A));
        System.out.println("The minimum number : " + min(A));
        System.out.println("The number of prime numbers : " + primeNumbers);
        System.out.println("The number of palindrome numbers : " + palindromeNumbers);
        System.out.println("The number that has the maximum number of divisors : " + elementOfMaxDivisor(A));

    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }

    public static int divisors(int n) {
        int divisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }
        return divisors;
    }

    public static int elementOfMaxDivisor(int[] a) {
        int elementOfMaxDivisor = 0;
        int maxDivisors = 0;
        for (int i = 0; i < a.length; i++) {
            int countOfDivisors = divisors(a[i]);
            if (countOfDivisors > maxDivisors || (countOfDivisors == maxDivisors && a[i] > elementOfMaxDivisor)) {
                maxDivisors = countOfDivisors;
                elementOfMaxDivisor = a[i];
            }
        }
        return elementOfMaxDivisor;
    }


}