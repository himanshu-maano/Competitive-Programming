// https://codeforces.com/problemset/problem/1899/B

import java.util.*;
import java.io.*;

public class CF1899B_250_Thousand_Tons_of_TNT {
    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    private static void mano() {
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }

        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + a[i - 1];
        }

        long ans = 0;
        for (int k = 1; k <= n; k++) {
            if (n % k == 0) {
                long max = 0, min = (long)1e18;
                for (int i = k; i <= n; i += k) {
                    long v = prefix[i] - prefix[i - k];
                    max = Math.max(max, v);
                    min = Math.min(min, v);
                }
                ans = Math.max(ans, max - min);
            }
        }

        System.out.println(ans);

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        boolean nextBoolean() {
            return Boolean.parseBoolean(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}