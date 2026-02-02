package BasicMaths;

public class Fibonacci {
   

    public static void main(String[] args) {

        int n = 10;   // number of terms

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }


}
