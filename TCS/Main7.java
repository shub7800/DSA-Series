package TCS;

import java.util.*;

public class Main7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        // correct input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new TreeSet<>();

        for(int i = 0; i < arr.length; i++){
            if(seen.contains(arr[i])){
                dup.add(arr[i]);
            } else {
                seen.add(arr[i]);
            }
        }

        // correct output
        for(int num : seen){
            System.out.print(num + " ");
        }

        sc.close();
    }
}