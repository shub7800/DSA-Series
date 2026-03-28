package TCS.TCSPrevious;

import java.util.*;

public class Question60 {
    public static void main(String []args){
        try{Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum + n*i;
        }
        System.out.println(sum);}catch(Exception e){
            System.out.println("Error");
        }
    }
}
