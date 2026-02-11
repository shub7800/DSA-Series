package Sorting;

public class LeetCode33 {
    public static int search(int arr[],int target,int si ,int ei){
        if(si>ei){
            return -1;
        }

        int mid =si+(ei-si)/2;

        //case found 
        if(arr[mid]==target){
            return mid;
        }

        //case mid on l1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1) ;
            }else{
                return search(arr, target, mid+1, ei);
            }
        }

        //case mid on l2
        else{
            if(arr[mid+1]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int index=search(arr, target,0,arr.length-1);
        System.out.println(index);
    }
}
