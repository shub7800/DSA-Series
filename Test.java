import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dup=new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++){
            if(seen.contains(arr[i])){
                dup.add(arr[i]);
            }else{
                seen.add(arr[i]);
            }
        }

        for(int num : dup){
            System.out.print(num +" ");
        }

        sc.close();
        
    }
}