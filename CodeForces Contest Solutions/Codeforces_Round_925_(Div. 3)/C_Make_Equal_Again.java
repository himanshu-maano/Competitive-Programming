import java.util.*;

public class C_Make_Equal_Again {

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

        int i = 0;
        while (i + 1 < n && a[i] == a[i + 1]) {
            i++;
        }

        int j = n - 1;
        while (j > 0 && a[j] == a[j - 1]) {
            j--;
        }

        int max = Math.max(i + 1, n - j);
        if (a[0] == a[n - 1]) {
            max = i + 1 + n - j;
        }

        System.out.println(Math.max(0, n - max));

    }
}