package TCS.numberBased;


import java.util.*;

public class factorofnum {
    public static void main(String[] args){
        int n=10;
        //1,2,5,10
        
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
