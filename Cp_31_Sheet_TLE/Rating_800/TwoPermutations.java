package Rating_800;

import java.util.*;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int test = reader.nextInt();
        while(test-- > 0) {
            int n = reader.nextInt();
            int a = reader.nextInt();
            int b = reader.nextInt();

            if(n == a && n == b) {
                System.out.println("YES");
                continue;
            }

            if((a+b) <= n - 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        reader.close();
    }
}
