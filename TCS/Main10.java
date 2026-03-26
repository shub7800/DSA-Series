package TCS;

import java.util.*;

public class Main10 {
    public static int[] move(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int ans[]=move(arr);
        for(int num:ans){
            System.out.print(num+" ");
        }
        System.out.println();
        

    }
}
