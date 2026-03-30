package TCS.TCSPrevious;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int n = input.charAt(0) - '0';
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.charAt(i + 1) - '0';
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

    }
}
