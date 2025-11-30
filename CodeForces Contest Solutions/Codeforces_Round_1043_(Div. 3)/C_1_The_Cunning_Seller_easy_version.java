import java.util.*;

public class C_1_The_Cunning_Seller_easy_version {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        long n = sc.nextLong();

        long ans = 0;
        for (int i = 18; i >= 0; i--) {
            long wm = (long) Math.pow(3, i);
            long coin = (long) Math.pow(3, i + 1) + i * (long) Math.pow(3, i - 1);
            while (wm <= n) {
                n -= wm;
                ans += coin;
            }
            if (n == 0) break;
        }

        System.out.println(ans);
    }
}