package Arrays.EASY;

/*
                          * Question: Remove Duplicates from Sorted Array
                          * 
                          * Given an integer array nums sorted in non-decreasing order,
                          * remove the duplicates in-place such that each unique element appears only
                          * once.
                          * 
                          * The relative order of the elements should be kept the same.
                          * 
                          * Return the number of unique elements (k).
                          * 
                          * Note:
                          * Do not allocate extra space for another array.
                          * You must modify the input array in-place.
*/

public class Leetcode26 {
    public static int removeDuplicates(int[] nums) {

        // If array is empty
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // Index of last unique element

        // Start checking from second element
        for (int j = 1; j < nums.length; j++) {

            // If new unique element found
            if (nums[j] != nums[i]) {
                i++; // Move unique pointer
                nums[i] = nums[j]; // Place new unique element
            }
        }

        // Total unique elements count
        return i + 1;
    }

    // Main method to test
    public static void main(String[] args) {

        // Example 1
        int[] arr1 = { 1, 1, 2 };
        int k1 = removeDuplicates(arr1);
        System.out.println("Example 1 Unique Count: " + k1);
        printArray(arr1, k1);

        // Example 2
        int[] arr2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = removeDuplicates(arr2);
        System.out.println("Example 2 Unique Count: " + k2);
        printArray(arr2, k2);

        // Example 3
        int[] arr3 = { 1, 1, 1, 1 };
        int k3 = removeDuplicates(arr3);
        System.out.println("Example 3 Unique Count: " + k3);
        printArray(arr3, k3);

        // Example 4
        int[] arr4 = { 1, 2, 3, 4 };
        int k4 = removeDuplicates(arr4);
        System.out.println("Example 4 Unique Count: " + k4);
        printArray(arr4, k4);
    }

    // Helper method to print only unique part
    public static void printArray(int[] nums, int k) {
        System.out.print("Unique Elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }
}
