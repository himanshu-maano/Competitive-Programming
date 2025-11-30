import java.util.*;

public class B_Maximum_Cost_Permutation {
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
        boolean[] per = new boolean[n + 1];
        int zero = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            per[a[i]] = true;
            if (a[i] == 0) {
                zero++;
            }
        }

        int l = 0, r = n - 1;
        while (l < n && a[l] == (l + 1)) {
            l++;
        }
        while (r >= 0 && a[r] == (r + 1)) {
            r--;
        }

        if (zero == 1) {
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    for (int j = 1; j <= n; j++) {
                        if (!per[j]) {
                            a[i] = j;
                        }
                    }
                }
            }
            l = 0;
            r = n - 1;
            while (l < n && a[l] == (l + 1)) {
                l++;
            }
            while (r >= 0 && a[r] == (r + 1)) {
                r--;
            }
        }

        System.out.println(Math.max(0, r - l + 1));
    }
}