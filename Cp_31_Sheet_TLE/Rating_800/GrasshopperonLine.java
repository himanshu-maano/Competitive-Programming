package Rating_800;

import java.util.Scanner;

public class GrasshopperonLine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int target = reader.nextInt();
            int obstacle = reader.nextInt();

            if (target % obstacle != 0) {
                System.out.println(1);
                System.out.println(target);
            } else {
                System.out.println(2);
                System.out.println(1 + " " + (target - 1));
            }
        }
        reader.close();
    }
}
