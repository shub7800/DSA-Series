package BasicMaths;

import java.util.Scanner;

public class countDigit {
    public static int DigitCount(int n) {
        int count = 0;
        while (n > 0) {
            count += 1;
            n = n / 10;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("N: " + N);
        int digits = DigitCount(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
