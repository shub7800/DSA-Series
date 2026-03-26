package TCS;

import java.util.Scanner;

public class Main8 {

    public static int firstOcc(int arr[], int target){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int lastOcc(int arr[], int target){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        // fixed input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int first = firstOcc(arr, target);
        int last = lastOcc(arr, target);

        if(first == -1){
            System.out.println(0);
        } else {
            System.out.println(last - first + 1);
        }

        sc.close();
    }
}