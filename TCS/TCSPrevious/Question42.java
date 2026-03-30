package TCS.TCSPrevious;

import java.util.*;

public class Question42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");

        TreeSet<String> set = new TreeSet<>();

        for (String word : words) {
            set.add(word);
        }

        //assending 
        for(String word : set){
            System.out.print(word+ " ");
        }
        System.out.println();

        ArrayList<String> list=new ArrayList<>(set);
        Collections.reverse(list);

        for(String  word : list){
            System.out.print(word +" ");
        }

        sc.close();

    }

}
