package BasicMaths;

import java.util.Scanner;

public class reverseDigit {
    public static int reverse(int n){
        int rev= 0;
        while (n>0){
            int ld = n%10;
            rev = rev*10 +ld;
            n=n/10;
        }
        return rev ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("N: " + N);
        System.out.println(reverse(N));
        
    }
}
