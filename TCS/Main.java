package TCS;

import java.util.*;

public class Main {
    public static int largest(int n, int arr[]) {
        // largest element
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        // arr[i]=sc.nextInt();
        // }
        // int result =largest(n, arr);
        // System.out.println(result);
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String ch[] = input.split(" ");

        int n = ch.length;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(ch[i]);
        }

        int result = largest(n, arr);

        System.out.println(result);

        sc.close();

    }
}
