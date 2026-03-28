package TCS.TCSPrevious;

public class Question55 {
    public static void main(String[] args) {
        int n=162;
        int temp=n;
        int sum=0;
        int count=0;
        while (temp!=0) {
            count++;
            int ld=temp%10;
            sum += ld;
            temp=temp/10;
        }

        if(count==3 && sum%9==0){
            System.out.print("Number "+n+" is divisible by 9");
        }else{
            System.out.println("Number "+n+" is not divisible by 9");
        }
    }
}
