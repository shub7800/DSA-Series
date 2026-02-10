package Sorting;

public class CountingSort {

    // Ye function array ko counting sort se sort karta hai
    public static void countingSort(int arr[]) {

        // STEP 1: Sabse bada element find karo
        // kyunki count array ka size usi pe depend karta hai
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // har element ko compare karke max nikal rahe hain
            largest = Math.max(largest, arr[i]);
        }

        // STEP 2: Count array banao
        // index = number
        // value = kitni baar aaya
        int count[] = new int[largest + 1];

        // STEP 3: Har number ki frequency count karo
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;   // jis number pe aaye us index pe +1
        }

        // STEP 4: Original array ko sorted form me bharo
        int j = 0; // arr ka index

        // i = number (0 se largest tak)
        for (int i = 0; i < count.length; i++) {

            // jab tak count[i] > 0 hai
            // tab tak i ko array me daalte jao
            while (count[i] > 0) {

                arr[j] = i;   // number i ko arr me daalo
                j++;          // next position
                count[i]--;  // ek baar use ho gaya
            }
        }
    }

    // Array print karne ke liye function
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };

        System.out.println("Before Sorting:");
        printArray(arr);

        countingSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
