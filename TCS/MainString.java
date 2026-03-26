package TCS;

import java.util.*;

public class MainString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindrome= false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }



        sc.close();

    }
}
