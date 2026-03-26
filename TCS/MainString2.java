package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class MainString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String s1=sc.nextLine().toLowerCase();
            String s2=sc.nextLine().toLowerCase();
            if(s1.length()!=s2.length()){
                System.out.println(false);
                return;
            }

            char []a=s1.toCharArray();
            char []b=s2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            System.out.println(Arrays.equals(a,b));
        }catch(Exception e){
            System.out.println(false);
        }

        sc.close();
    }
}
