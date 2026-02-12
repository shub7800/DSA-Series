/*
Question:

Given an array nums, return true if the array was originally sorted in 
non-decreasing order, then rotated some number of positions (including zero). 
Otherwise, return false.

There may be duplicates in the original array.

Note:
An array A rotated by x positions results in an array B of the same length 
such that:
B[i] == A[(i + x) % A.length]
for every valid index i.
*/

package Arrays.EASY;

public class Leetcode1752 {

    // Function to check if array is sorted and rotated
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Check if order breaks
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // If break happens more than once, it's not valid
        return count <= 1;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Example 1 (Valid rotated sorted array)
        int[] arr1 = {3, 4, 5, 1, 2};
        System.out.println("Example 1 Result: " + check(arr1));

        // Example 2 (Not sorted + rotated)
        int[] arr2 = {2, 1, 3, 4};
        System.out.println("Example 2 Result: " + check(arr2));

        // Example 3 (Already sorted)
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Example 3 Result: " + check(arr3));

        // Example 4 (All elements same)
        int[] arr4 = {1, 1, 1, 1};
        System.out.println("Example 4 Result: " + check(arr4));
    }
}
