package TCS;

import java.util.*;

public class Main9 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int m=arr.length;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>m/2){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
