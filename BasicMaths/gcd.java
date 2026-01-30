package BasicMaths;

public class gcd {
    public static int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else if(b>a){
                b=b%a;
            }
        }
        if (a==0) return b;
        return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(20, 8));
        
    }
}

