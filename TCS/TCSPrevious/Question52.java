package TCS.TCSPrevious;

import java.util.*;

public class Question52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } 

        for(int i=0;i<arr.length;i++){
            int sm=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[sm]>arr[j]){
                    sm=j;
                }
            }
            int temp=arr[sm];
            arr[sm]=arr[i];
            arr[i]=temp;
        } 
        
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     
    }

}
