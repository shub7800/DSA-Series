package TCS.TCSPrevious;

import java.util.*;

public class Question43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        input=input.substring(1,input.length()-1);
        String part[]=input.split(",");

        ArrayList<Boolean> result=new ArrayList<>();

        for(int i=0;i<part.length;i++){
            int num = Integer.parseInt(part[i].trim());
            int temp=num;
            int count=0;
            int sum=0;
            while (temp!=0){
                count++;
                temp /= 10;
            }

            temp=num;
            while(temp!=0){
                int ld=temp%10;
                sum += (int)Math.pow(ld,count);
                temp /= 10;
            }
            result.add(sum==num);
        }
        System.out.println(result);
        
    }

}
