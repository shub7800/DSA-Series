package TCS;

import java.util.*;


public class Main6 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Set<Integer> set =new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        for(int num : set){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
