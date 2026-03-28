package TCS;

public class SlidingWindowsSum {
    public static void main(String[] args) {
        int []arr={2, 1, 5, 1, 3, 2};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        //sliding 
        for(int i=k;i<arr.length;i++){
            sum = sum -arr[i-k]+arr[i];
            System.out.println(sum);
        }
    }
}
