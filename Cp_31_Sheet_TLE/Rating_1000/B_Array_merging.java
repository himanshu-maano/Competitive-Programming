import java.util.*;

public class B_Array_merging {
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

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        long[] maxLenInA = new long[2*n + 1];
        long[] maxLenInB = new long[2*n + 1];

        long len1 = 1, len2 = 1;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && a[i] == a[i + 1]) {
                len1++;
            } else if (i == n - 1 || a[i] != a[i + 1]) {
                maxLenInA[a[i]] = Math.max(maxLenInA[a[i]], len1);
                len1 = 1;
            }

            if (i < n - 1 && b[i] == b[i + 1]) {
                len2++;
            } else if (i == n - 1 || b[i] != b[i + 1]) {
                maxLenInB[b[i]] = Math.max(maxLenInB[b[i]], len2);
                len2 = 1;
            }
        }

        long maxLen = 0;
        for(int i=1; i<=2*n; i++) {
            maxLen = Math.max(maxLen, maxLenInA[i] + maxLenInB[i]);
        }

        System.out.println(maxLen);
    }
}