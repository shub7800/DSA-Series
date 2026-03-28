package TCS.TCSPrevious;

public class Question59 {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b=1;
        int sum=0;

        for(int i=0;i<n;i++){
            sum =  sum + a;
            // System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);

    }
}
