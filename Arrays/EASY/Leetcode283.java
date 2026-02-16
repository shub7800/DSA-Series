package Arrays.EASY;

public class Leetcode283 {

    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};

        Leetcode283 obj = new Leetcode283();  // object create
        obj.moveZeroes(arr);                  // method call

        // print array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
