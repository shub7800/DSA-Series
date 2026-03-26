package TCS;

import java.util.Scanner;

public class Main2 {
    public static void find(int arr[],int n ){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
            smallest=Math.min(smallest,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
            if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println(secondLargest);
        System.out.println(secondSmallest);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        find(arr, n);
        sc.close();
    }
}
