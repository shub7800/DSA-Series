package TCS.numberBased;

import java.util.*;

public class CheckPalindrom {
    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=251;
        int temp=n;
        int rev=0;
        int rem;
        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }

        if(rev==n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        // sc.close();
    }
}
