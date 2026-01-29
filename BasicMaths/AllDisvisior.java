package BasicMaths;
import java.util.Arrays;

public class AllDisvisior {
    /* Function to find all 
    divisors of n */
    public int[] divisors(int n) {
        
        // Initial size of the array is set to n
        int[] temp = new int[n];
        int count = 0;
        
        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // If a divisor is found
            if (n % i == 0) {
                // Add it to the array
                temp[count++] = i;
            }
        }
        
        /* Copy the divisors to an 
        array of the exact size */
        int[] ans = Arrays.copyOf(temp, count);
        
        // Return the result
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        
        /* Creating an instance of 
        Solution class */
        AllDisvisior sol = new AllDisvisior();
        
        /* Function call to find 
        all divisors of n */
        int[] ans = sol.divisors(n);
        
        System.out.print("The divisors of " + n + " are: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

