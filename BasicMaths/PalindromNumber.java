package BasicMaths;

public class PalindromNumber {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int dup = x;
        int rev = 0;

        while (x != 0) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x = x / 10;
        }

        return rev == dup;
    }

    public static void main(String[] args) {

        PalindromNumber obj = new PalindromNumber();   // create object
        System.out.println(obj.isPalindrome(121));    // call method
    }
}
