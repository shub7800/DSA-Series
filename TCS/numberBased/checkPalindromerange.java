package TCS.numberBased;

public class checkPalindromerange {
    public static void main(String []args){
        int n=50;
        for(int i=1;i<=n;i++){
            int temp=i;
            int rev=0;
            int rem;
            while (temp!=0){
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(i==rev){
                System.out.print(i+" ");
            }
        }
    }
}
