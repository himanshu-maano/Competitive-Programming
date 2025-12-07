// https://codeforces.com/problemset/problem/1618/C

import java.util.*;
import java.io.*;

public class CF1618C_Paint_the_Array {

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

        // gcd1 is give max d if we start painting from odd index and
        // gcd2 will give for all even indices.
        long gcd1 = a[0], gcd2 = a[1];
        for (int i = 2; i < n; i++) {
            if ((i & 1) == 0) {
                gcd1 = gcd(gcd1, a[i]);
            } else {
                gcd2 = gcd(gcd2, a[i]);
            }
        }

        // it checks that odd and even indices gcd dont dividess each ohter mean that d
        // is
        // not some value which will divide adjacent indices...
        boolean ok1 = true, ok2 = true;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                if (a[i] % gcd2 == 0) {
                    ok2 = false;
                }
            } else {
                if (a[i] % gcd1 == 0) {
                    ok1 = false;
                }
            }
        }

        if (ok1) {
            System.out.println(gcd1);
        } else if (ok2) {
            System.out.println(gcd2);
        } else {
            System.out.println(0);
        }

    }

    private static long gcd(long a, long b) {
        if (a == 0L) {
            return b;
        }
        return gcd(b % a, a);
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