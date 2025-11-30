import java.util.*;

public class D_Very_Different_Array {

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
        int m = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = m - 1;
        int l = 0, r = n - 1;

        long ans = 0;

        while (l <= r) {
            long best = a[r] - b[i];
            if (b[j] - a[l] > best) {
                best =  b[j] - a[l];
                l++;
                j--;
            } else {
                r--;
                i++;
            }

            ans += best;
        }

        System.out.println(ans);

    }
}