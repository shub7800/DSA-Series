package TCS.numberBased;

public class GpSeries {
    public static void main(String[] args) {
        int a = 2, r = 3, n = 4;
        int sum;

        if (r == 1) {
            sum = n * a;   // special case
        } else {
            sum = (int)(a * (1 - Math.pow(r, n)) / (1 - r)); // normal case
        }

        System.out.println(sum);
    }
}