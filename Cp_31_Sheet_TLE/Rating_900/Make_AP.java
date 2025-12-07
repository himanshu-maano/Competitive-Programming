package Rating_900;

import java.util.*;

public class Make_AP {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = reader.nextInt();
        while (test-- > 0) {
            solve();
        }
        reader.close();
    }

    private static void solve() {
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();


        if((2*b - c) % a == 0 && (2*b - c) > 0) {
            System.out.println("YES");
        } else if((2*b - a) % c == 0 && (2*b - a) > 0) {
            System.out.println("YES");
        } else if((a + c) % 2*b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
