package Arrays;

public class largestNumber {
    public static int getLargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
             if(largest<num[i]){
                largest=num[i];
             }

        }
        return largest;
    }
    public static void main(String[] args) {
        int number[]={1,2,6,3,5};
        System.out.println(getLargest(number));
        
    }
}
