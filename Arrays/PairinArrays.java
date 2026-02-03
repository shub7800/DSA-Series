package Arrays;

public class PairinArrays {

    public static void pair(int num[]) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {

                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println(); // new line after each row
        }
    }

    public static void main(String[] args) {

        int num[] = {2, 4, 6, 8, 10};

        pair(num);
    }
}
