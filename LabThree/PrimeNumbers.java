import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNumbers {

    // --- main method (as seen in the image) ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
        }

        System.out.println("Total prime numbers between " + start + " and " + end + " = " + count);
        System.out.println("Prime numbers: " + primes);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
