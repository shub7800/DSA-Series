package Arrays;

public class MaxSubarraySumbrute {
    public static int subArraySum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += num[k];
                }if(maxSum<currSum){
                    maxSum =currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int [] num ={1,-2,6,-1,3};
        System.out.println(subArraySum(num));
    }
}
