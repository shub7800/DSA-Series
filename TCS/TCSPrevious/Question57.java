package TCS.TCSPrevious;

import java.util.*;

public class Question57 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            ArrayList<String> result = new ArrayList<>();

            double femaleSum = 0;
            int femaleCount = 0;

            while (sc.hasNext()) {
                String name = sc.next(); // ✅ fix
                int age = sc.nextInt();
                String gender = sc.next();
                double grade = sc.nextDouble();

                // age > 20
                if (age > 20) {
                    result.add(name); // ✅ store
                }

                // female avg
                if (gender.equalsIgnoreCase("female")) {
                    femaleSum += grade;
                    femaleCount++;
                }
            }

            // print names
            for (String name : result) {
                System.out.print(name + " ");
            }

            System.out.println();

            // print avg
            if (femaleCount > 0) {
                double avg = femaleSum / femaleCount;
                System.out.printf("%.2f", avg); // ✅ format
            } else {
                System.out.println("0.00");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}