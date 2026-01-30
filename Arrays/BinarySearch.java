package Arrays;

public class BinarySearch {
       public static int binarySearch(int nums[], int key){
        int start=0 , end = nums.length-1;
        while(start<=end){
            int mid= (start +end)/2;

            // compaire 
            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]<key){
                start = mid +1;
            }else{
                end=mid-1;
            }
        }
        return -1; 
        
    }
    public static void main(String[] args) {
        int [] mark={2,4,6,8,10,12,14,16};
        int key =10;
        int index= binarySearch(mark, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("found");
        }


    }
}
