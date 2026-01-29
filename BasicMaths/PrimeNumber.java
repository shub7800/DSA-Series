package BasicMaths;

public class PrimeNumber {
    public boolean isPrime(int x) {
        int count =0;
        for(int i=1;i*i<=x;i++){
            if(x%i==0){
                count ++;
                if(i!= x/i){
                    count ++;
                }
            }
        }

        return (count==2)  ;

    }
    public static void main(String[] args) {
        int n=5;
        PrimeNumber obj= new PrimeNumber();
        System.out.println(obj.isPrime(n));
    }
}
