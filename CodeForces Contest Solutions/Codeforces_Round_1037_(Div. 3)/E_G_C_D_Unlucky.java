import java.util.*;

public class E_G_C_D_Unlucky {

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
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        if(a[n-1] != b[0]) {
            System.out.println("NO");
            return;
        }

        boolean ok = true;

        for(int i=1; i<n; i++) {
            if(a[i - 1] % a[i] != 0) {
                ok = false;
            }
        }

        for(int i=n-2; i>=0; i--) {
            if(b[i + 1] % b[i] != 0) {
                ok = false;
            }
        }

        for(int i=0; i<n-1; i++) {
            if(gcd(a[i], b[i+1]) != a[n-1]) {
                ok = false;
            }
        }

        if(ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    private static long gcd(long a, long b) {
        if (a == 0L) {
            return b;
        }
        return gcd(b % a, a);
    }
}