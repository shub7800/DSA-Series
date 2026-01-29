package BasicMaths;

public class Armstrong {

    public boolean isArmstrong(int n) {
        int sum = 0;
        int copy = n;

        while (n != 0) {
            int ld = n % 10;
            int pow = (int) Math.pow(ld, 3);  // cube of digit
            sum = sum + pow;                 // add to sum
            n = n / 10;                      // reduce number
        }

        return sum == copy;
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();

        int num = 153;

        if (obj.isArmstrong(num)) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is NOT Armstrong");
        }
    }
}
