import java.util.*;

public class B_Luntik_and_Subsequences {
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long cnt1 = 0, cnt0 = 0;
        for (int x : a) {
            if (x == 1) {
                cnt1++;
            } else if (x == 0) {
                cnt0++;
            }
        }

        System.out.println(cnt1 * (1L << cnt0));
    }
}