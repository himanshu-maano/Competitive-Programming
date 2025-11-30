import java.util.*;

public class A_Incremental_Subarray {

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
        long[] a = new long[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextLong();
        }

        boolean ok = true;
        for (int i = 1; i < m; i++) {
            if (a[i] <= a[i - 1]) {
                ok = false;
            }
        }

        if (ok) {
            System.out.println(n - a[m-1] + 1);
        } else {
            System.out.println(1);
        }
    }
}