package TCS;

import java.util.Scanner;

public class Main4 {
    public static int removeDuplicate(int arr[], int n) {
        int i = 0;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int newArray=removeDuplicate(arr, n);
       for(int i=0;i<newArray;i++){
        System.out.print(arr[i]+" ");
       }
       sc.close();

    }
}
