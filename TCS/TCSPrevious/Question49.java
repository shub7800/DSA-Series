package TCS.TCSPrevious;

public class Question49 {
    public static void main(String[] args) {
        int n=9;
        int arr[]={1,2,3,4,5,6,8,9,10};
        int sum=0;
        int m=n+1;
        int total=m*(m+1)/2;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int missing=total-sum;
        System.out.println(missing + " ");
    }
}
