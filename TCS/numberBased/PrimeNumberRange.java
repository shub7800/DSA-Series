package TCS.numberBased;

public class PrimeNumberRange {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            // int temp=i;
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
                sum=sum +i;
                
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
