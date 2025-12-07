import java.util.*;

public class A_Buying_Torches {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long x = sc.nextLong();
        long y = sc.nextLong();
        long k = sc.nextLong();

        long step = (y * k) + (k - 1);

        long op = Math.ceilDiv(step, x - 1);

        System.out.println(op + k);
    }
}