package TCS.TCSPrevious;

import java.util.*;

public class question44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
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
