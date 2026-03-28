package TCS.TCSPrevious;

import java.util.*;

public class Question62 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        for(int i=n;i<=m;i++){
            sum += i*i*i;
        }
        System.out.println(sum);

    }
}
