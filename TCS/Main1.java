package TCS;

import java.util.Scanner;

public class Main1 {
    public static void kadanes(int n ,int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        kadanes(n, arr);
    }
}
