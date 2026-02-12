package Arrays.EASY;

public class SecondLargest {
    public static void secondLargest(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            System.out.println("Second smallest is "+-1 + " " +"Second largest is " + -1);
            return;
        }

        int ms1 = Integer.MIN_VALUE, ms2 = Integer.MIN_VALUE;
        int sm1 = Integer.MAX_VALUE, sm2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ms1 = Math.max(ms1, arr[i]);
            sm1 = Math.min(sm1, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (sm2 > arr[i] && arr[i] != sm1) {
                sm2 = arr[i];
            }
            if (ms2 < arr[i] && arr[i] != ms1) {
                ms2 = arr[i];
            }

        }
        System.out.println("Second smallest is " + sm2);
        System.out.println("Second largest is " + ms2);
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        secondLargest(arr);

    }
}
