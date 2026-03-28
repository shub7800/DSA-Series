package TCS.numberBased;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;

            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}