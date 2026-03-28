package TCS;

public class SlidingSum {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {100, 200, 300, 400};
        int k = 2;

        int max = 0;

        for(int i = 0; i <= n - k; i++){
            int sum = 0; // ✅ reset for each window
            
            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }

            max = Math.max(sum, max); // ✅ update inside loop
        }

        System.out.println(max);
    }
}