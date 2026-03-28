package TCS.TCSPrevious;


import java.util.*;


public class Question56 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int maxDiff=Integer.MIN_VALUE;
        int minsoFor=arr[0];
        for(int i=1;i<n;i++){
            int diff=arr[i]-minsoFor;
            maxDiff=Math.max(maxDiff,diff);
            minsoFor=Math.min(minsoFor,arr[i]);
        }

        System.out.println(maxDiff);





        sc.close();

    }
}
