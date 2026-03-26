package String;

import java.util.Scanner;

public class ShortestPath {
    public static double getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = Character.toLowerCase( path.charAt(i));
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String path=sc.nextLine();

        System.out.println(getShortestPath(path));
    }
}
