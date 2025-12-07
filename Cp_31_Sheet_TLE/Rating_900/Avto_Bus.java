// package Rating_900;

import java.util.*;

public class Avto_Bus {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            long n = reader.nextLong();
            if ((n & 1) == 1 || n < 4) {
                System.out.println("-1");
            } else {
                // here adding 5 ensures ceil value 
                System.out.println((n + 5) / 6 + " " + (n / 4)); 
            }

        }
        reader.close();
    }
}
