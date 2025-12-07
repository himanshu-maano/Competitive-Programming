package Rating_800;

import java.util.*;

public class Coins {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            long n = reader.nextLong();
            long k = reader.nextLong();

            if ((n & 1) == 0) {
                System.out.println("YES");
            } else if ((n & 1) == 1) {
                if ((k & 1) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        reader.close();
    }
}
