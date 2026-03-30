package TCS.TCSPrevious;

import java.util.*;

public class question45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long[] arr = new long[(int)n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print("ThreeFive ");
            } else if (arr[i] % 3 == 0) {
                System.out.print("Three ");
            } else if (arr[i] % 5 == 0) {
                System.out.print("Five ");
            } else {
                System.out.print(arr[i] + " ");
            }         
        }
    }
}
