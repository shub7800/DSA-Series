package TCS.TCSPrevious;

import java.util.Scanner;

public class Question47 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();

        long rem =x%y;

        long lower= x-rem;
        long upper= x + (y-rem);

        if(rem<y-rem){
            System.out.println(lower);
        }else{
            System.out.println(upper);
        }

    }
}
