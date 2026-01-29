package BasicMaths; 
import java.util.*;

class AllDivisors {

    public static List<Integer> allDivisors(int n) {

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {

                result.add(i);

                if(i != n / i) {
                    result.add(n / i);
                }
            }
        }

        // sort inside function
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {

        int n = 36;

        List<Integer> ans = allDivisors(n);

        System.out.println(ans);
    }
}
