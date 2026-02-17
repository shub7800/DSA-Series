package Arrays.EASY;

import java.util.*;

public class unionArray {
    public static ArrayList<Integer> union(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        // add first array
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // add second array
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // convert set to list
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};

        System.out.println(union(arr1, arr2));
    }
}

