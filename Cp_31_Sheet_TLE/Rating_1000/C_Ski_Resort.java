import java.util.*;

public class C_Ski_Resort {
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
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long ans = 0;
        long len = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= q) {
                len++;
            } else {
                if (len >= k) {
                    long sizeK = (len - k + 1);
                    ans += (sizeK * (sizeK + 1)) / 2;
                }
                len = 0;
            }
        }
        if (len >= k) {
            long sizeK = (len - k + 1);
            ans += (sizeK * (sizeK + 1)) / 2;
        }

        System.out.println(ans);

    }
}