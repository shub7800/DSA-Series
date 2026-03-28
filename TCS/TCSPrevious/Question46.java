package TCS.TCSPrevious;

import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {

        int N = 5; // input

        // Error handling
        if (N <= 0) {
            System.out.println("Error!");
            return;
        }

        // ---------------- TASK 1 ----------------
        int k = N; // given number ke liye sequence
        int num = k;

        System.out.print("[");
        while (num != 1) {
            System.out.print(num + ", ");
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
        }
        System.out.println("1]");

        // ---------------- TASK 2 ----------------
        int maxLength = 0;
        int bestK = 0;

        for (int i = 1; i <= N; i++) {
            int temp = i;
            int length = 0;

            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = 3 * temp + 1;
                }
                length++;
            }
            length++; // include 1

            if (length > maxLength) {
                maxLength = length;
                bestK = i;
            }
        }

        System.out.println(maxLength + ", " + bestK);

        // ---------------- TASK 3 ----------------
        int maxValue = 0;
        int valueK = 0;

        for (int i = 1; i <= N; i++) {
            int temp = i;

            while (temp != 1) {
                if (temp > maxValue) {
                    maxValue = temp;
                    valueK = i;
                }

                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = 3 * temp + 1;
                }
            }

            // last 1 check
            if (1 > maxValue) {
                maxValue = 1;
                valueK = i;
            }
        }

        System.out.println(maxValue + ", " + valueK);
    }

}
