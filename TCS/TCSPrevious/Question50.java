package TCS.TCSPrevious;

import java.util.Scanner;

public class Question50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); 
        int m=sc.nextInt();
        
        for(int i=n;i<=m;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count ==2){
                System.out.print(i+" ");
            }

        }
    }
}
