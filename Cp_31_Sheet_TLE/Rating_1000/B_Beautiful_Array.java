import java.util.*;

public class B_Beautiful_Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long b = sc.nextLong();
        long s = sc.nextLong();

        long[] ans = new long[n];
        long lower_Bound = b * k;
        long upper_Bound = (b * k + (k - 1) * n);

        if (lower_Bound <= s && s <= upper_Bound) {
            ans[n - 1] = lower_Bound;
            long x = s - lower_Bound;
            for (int i = n - 1; i >= 0 && x > 0; i--) {
                if (x > k - 1) {
                    ans[i] += k - 1;
                } else {
                    ans[i] += x;
                }
                x -= k - 1;
            }
        } else {
            System.out.println(-1);
            return;
        }

        for (long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}