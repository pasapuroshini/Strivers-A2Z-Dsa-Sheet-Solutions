```
import java.util.Scanner;

public class SumOfPrimes {

    // Function to find the sum of all primes below n
    public static int sumOfPrimes(int n) {
        if (n <= 2) {
            return 0; // No primes below 2
        }

        // Boolean array to mark primes
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Calculate the sum of primes
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Taking user input for the limit n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();
        scanner.close();

        // Compute the sum of all primes below n
        int result = sumOfPrimes(n);
        System.out.println("Sum of prime numbers below " + n + ": " + result);
    }
}
```
