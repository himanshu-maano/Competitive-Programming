package Rating_800;

import java.util.*;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while (test-- > 0) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            int c = reader.nextInt();
            int d = reader.nextInt();

            if (b > d || (c == d && a < b) || (b == d && c > a)) {
                System.out.println(-1);
                continue;
            }  
            int move = d - b;

            if (a + move < c) {
                System.out.println(-1);
            } else{
                a += move;
                move += (a - c);
                System.out.println(move);
            }
        }
        reader.close();
    }
}
