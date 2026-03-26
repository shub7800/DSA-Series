package TCS.numberBased;

public class CheckPrimeNumber {
    public static void main(String []args){
        int n=23;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
