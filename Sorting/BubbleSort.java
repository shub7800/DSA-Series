package Sorting;
class BubbleSort {

    // Ye function array ko Bubble Sort se sort karta hai
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop → kitne passes lagenge
        for (int i = 0; i < n - 1; i++) {

            // Ye check karega ki is pass me swap hua ya nahi
            boolean swapped = false;

            // Inner loop → adjacent elements compare karega
            for (int j = 0; j < n - 1 - i; j++) {

                // Agar left element bada hai right element se
                if (arr[j] > arr[j + 1]) {

                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Bata do ki swap ho chuka hai
                    swapped = true;
                }
            }

            // Agar poore pass me ek bhi swap nahi hua
            // matlab array already sorted hai
            if (!swapped) {
                break; // loop yahin stop
            }
        }
    }

    // Array print karne ke liye function
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Before Sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }
}
