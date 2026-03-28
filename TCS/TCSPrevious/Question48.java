package TCS.TCSPrevious;

import java.util.*;

public class Question48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        int shift = sc.nextInt();
        if (password.length() < 8) {
            System.out.println("Invalid Password!");
            return;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            // digit check
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            }

            if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            }

            if (ch == '#' || ch == '@') {
                hasSpecial = true;
            }
        }

        if (!(hasDigit && hasLower && hasUpper && hasSpecial)) {
            System.out.println("Invalid Password");
        }

        String result = "";
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            // Special case
            if (ch == '@') {
                result = result + '#';
            } else if (ch == '#') {
                result = result + '@';
            } else {
                // Normal ASCII shift
                char newChar = (char) (ch + shift);
                result = result + newChar;
            }

        }

        System.out.println(result);

        sc.close();

    }
}
