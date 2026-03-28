package TCS.TCSPrevious;

import java.util.*;

public class Question54 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int m=sc.nextInt();
        // int m = 5;
        // int arr[]=new int[m];
        int arr[] = { 3, -2, -8, 4, 1 };
        // for(int  i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // for (int k = j + 1; k < n; k++) {
        // int product = arr[i] * arr[j] * arr[k];
        // max = Math.max(max, product);
        // }
        // }
        // }

        // System.out.println(max);
        Arrays.sort(arr);

        int n = arr.length;

        int option1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int option2 = arr[0] * arr[1] * arr[n - 1];

        System.out.println(Math.max(option1, option2));

    }
}
