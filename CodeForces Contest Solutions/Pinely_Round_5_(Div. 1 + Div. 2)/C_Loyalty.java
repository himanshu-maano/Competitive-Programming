import java.util.*;
import java.io.*;

public class C_Loyalty {

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
        long[] a = new long[n];

        long b = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b += a[i];
        }

        b = b / k;

        Arrays.sort(a);

        long p = 0;

        int e = n - (int) b;

        for (int i = n - 1; i >= e; i--) {
            p += a[i];
        }

        long[] ans = new long[n];
        int j = 0, l = 0, r = e;

        long currSum = 0;

        for (int i = 0; i < n; i++) {
            if (l < e && currSum + a[l] < k) {
                ans[j] = a[l++];
            } else {
                ans[j] = a[r++];
            }
            currSum = (currSum + ans[j]) % k;
            j++;
        }

        System.out.println(p);
        for(long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}