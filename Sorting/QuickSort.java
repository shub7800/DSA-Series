package Sorting;

public class QuickSort {

    // ================= QUICK SORT =================
    // Is function ka kaam:
    // Array ke ek part ko sort karna using Quick Sort
    public static void quickSort(int arr[], int si, int ei) {

        // STEP 1: Base case
        // Agar array me 0 ya 1 element hai
        // to wo already sorted hota hai
        if (si >= ei) {
            return;
        }

        // STEP 2:
        // Partition function call kar rahe hain
        // Ye pivot ko sahi jagah pe rakhega
        int pIdx = partition(arr, si, ei);

        // STEP 3:
        // Pivot ke left wale part ko sort karo
        quickSort(arr, si, pIdx - 1);

        // STEP 4:
        // Pivot ke right wale part ko sort karo
        quickSort(arr, pIdx + 1, ei);
    }

    // ================= PARTITION FUNCTION =================
    // Is function ka kaam:
    // 1. Ek pivot lena
    // 2. Pivot se chhote elements ko left me lana
    // 3. Pivot se bade elements ko right me chhodna
    // 4. Pivot ko beech me uski correct position pe rakhna
    public static int partition(int arr[], int si, int ei) {

        // STEP 1:
        // Last element ko pivot maan rahe hain
        int pivot = arr[ei];

        // STEP 2:
        // i ek boundary hai:
        // i ke left me sirf pivot se chhote elements honge
        int i = si - 1;

        // STEP 3:
        // j array ke elements ko pivot se compare karega
        for (int j = si; j < ei; j++) {

            // STEP 4:
            // Agar current element pivot se chhota ya equal hai
            if (arr[j] <= pivot) {

                // STEP 5:
                // Boundary ko aage badhao
                i++;

                // STEP 6:
                // Chhote element ko left side me le aao
                // (swap current element with boundary element)
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // STEP 7:
        // Ab pivot ko uski final position pe rakhna hai
        // Boundary ke just baad
        i++;

        // STEP 8:
        // Pivot ko boundary ke baad swap kar do
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        // STEP 9:
        // Pivot ka final index return karo
        return i;
    }

    // ================= PRINT ARRAY =================
    // Array print karne ke liye
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ================= MAIN FUNCTION =================
    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Before Sorting:");
        printArray(arr);

        // Quick Sort call
        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
