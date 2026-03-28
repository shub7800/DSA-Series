package TCS.TCSPrevious;

import java.util.*;

public class Question51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // check majority ;

            if (count >= n / 3) {
                int flag = 0;
                // avoid duplicate print
                for (int k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {

                    System.out.print(arr[i]+" ");
                }
            }

        }

        sc.close();
    }
}
