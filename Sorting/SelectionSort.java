package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int sm=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[sm]>arr[j]){
                    sm=j;
                }
            }
            int temp = arr[sm];
            arr[sm]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Before Sorting:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nAfter Sorting:");
        printArray(arr);
    
    }
}
