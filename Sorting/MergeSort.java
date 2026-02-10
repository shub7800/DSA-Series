package Sorting;

public class MergeSort {

    // ================= MERGE SORT FUNCTION =================
    // Is function ka kaam array ko chhote parts me todna hai
    // Jab tak single element na reh jaye
    public static void mergeSort(int arr[], int si, int ei) {

        // STEP 1:
        // Agar array me sirf 1 element bacha hai
        // to wo already sorted hota hai
        if (si >= ei) {
            return;
        }

        // STEP 2:
        // Mid nikal rahe hain taaki array ko 2 parts me tod sake
        int mid = si + (ei - si) / 2;

        // STEP 3:
        // Left part ko recursively sort kar rahe hain
        mergeSort(arr, si, mid);

        // STEP 4:
        // Right part ko recursively sort kar rahe hain
        mergeSort(arr, mid + 1, ei);

        // STEP 5:
        // Ab left aur right dono sorted ho chuke hain
        // Ab in dono ko merge karke ek sorted part banayenge
        merge(arr, si, mid, ei);
    }

    // ================= MERGE FUNCTION =================
    // Is function ka kaam:
    // Do already sorted parts ko ek sorted array banana
    public static void merge(int arr[], int si, int mid, int ei) {

        // STEP 1:
        // Temporary array bana rahe hain
        // Jisme sorted elements store karenge
        int temp[] = new int[ei - si + 1];

        // STEP 2:
        // Teen pointers use kar rahe hain
        int i = si;       // left part ka start
        int j = mid + 1;  // right part ka start
        int k = 0;        // temp array ka start

        // STEP 3:
        // Jab tak dono parts me elements hain
        // tab tak chhota element temp me daalte raho
        while (i <= mid && j <= ei) {

            // Compare left aur right ke current elements
            if (arr[i] <= arr[j]) {
                // Left chhota hai → temp me daalo
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                // Right chhota hai → temp me daalo
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // STEP 4:
        // Agar left part me kuch elements bache hain
        // to unhe seedha temp me copy kar do
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // STEP 5:
        // Agar right part me kuch elements bache hain
        // to unhe seedha temp me copy kar do
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // STEP 6:
        // Ab temp array me sorted data hai
        // Use original array me wapas copy kar rahe hain
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // ================= PRINT FUNCTION =================
    // Array ko print karne ke liye
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

        // Merge Sort call
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
