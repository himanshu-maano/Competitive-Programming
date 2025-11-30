import java.util.*;

public class C_Triple_Removal {

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
        int q = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int[] prev0 = new int[n + 1];
        int[] prev1 = new int[n + 1];

        int[] adj = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prev0[i] = prev0[i - 1] + (a[i - 1] == 0 ? 1 : 0);
            prev1[i] = prev1[i - 1] + (a[i - 1] == 1 ? 1 : 0);
        }

        for (int i = 1; i <= n; i++) {
            if (i < n && a[i] == a[i - 1]) {
                adj[i] = adj[i - 1] + 1;
            } else {
                adj[i] = adj[i - 1];
            }
        }

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int zero = prev0[r] - prev0[l - 1];
            int one = prev1[r] - prev1[l - 1];

            if (zero % 3 != 0 || one % 3 != 0) {
                System.out.println(-1);
            } else {
                int ans = (zero / 3) + (one / 3);
                if (adj[r - 1] - adj[l - 1] == 0) {
                    ans++;
                }
                System.out.println(ans);
            }
        }

    }
}