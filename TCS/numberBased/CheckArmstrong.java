package TCS.numberBased;

public class CheckArmstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum=0;
        int count=0;

        //step1 digit count 
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        temp=n;
        while (temp != 0) {
            int rem=temp%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=rem*power;
            }

            sum=sum+power;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }

}
