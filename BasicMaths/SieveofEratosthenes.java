package BasicMaths;

public class SieveofEratosthenes {

    public static void sieve(int n) {

        // If n is 0 or 1, no primes exist
        if (n < 2) {
            System.out.println("No prime numbers");
            System.out.println("Total primes = 0");
            return;
        }

        boolean[] isPrime = new boolean[n + 1];

        // Mark from 2 to n as prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve logic
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Print and count
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Total primes = " + count);
    }

    public static void main(String[] args) {

        sieve(0);  // test
        sieve(1);  // test
        sieve(50); // test

    }
}
