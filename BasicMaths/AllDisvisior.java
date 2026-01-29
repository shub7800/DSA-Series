package BasicMaths;

import java.util.*;


class AllDivisors {
    public static List<Integer> allDivisors(int n) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i * i <= n; i++) {

            if(n % i == 0) {

                list.add(i);   // first divisor

                if(i != n / i) {   // avoid duplicate for perfect square
                    list.add(n / i);  // paired divisor
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int n = 36;

        List<Integer> result = allDivisors(n);

        Collections.sort(result); // optional (for ordered output)

        System.out.println(result);
    }
}
