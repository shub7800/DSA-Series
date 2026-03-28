package TCS.TCSPrevious;

import java.util.*;

public class Question61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        // int[] arr = { 2,4,7,1,6,3};
        int k = 3;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }
    }
}
