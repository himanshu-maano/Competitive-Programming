import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = nextInt();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static void solve() throws Exception {
        int n = nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }

        if (n <= 2) {
            out.println(0);
            return;
        }

        Arrays.sort(a);

        int maxLen = 2;
        int l = 0;

        for (int r = 2; r < n; r++) {
            while (l + 1 < r && a[l] + a[l + 1] <= a[r]) {
                l++;
            }
            if (l + 1 < r) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }

        out.println(n - maxLen);
    }


    static String next() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null)
                return null; // prevents NullPointerException
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    static int nextInt() throws Exception {
        return Integer.parseInt(next());
    }

    static long nextLong() throws Exception {
        return Long.parseLong(next());
    }

    static double nextDouble() throws Exception {
        return Double.parseDouble(next());
    }
}