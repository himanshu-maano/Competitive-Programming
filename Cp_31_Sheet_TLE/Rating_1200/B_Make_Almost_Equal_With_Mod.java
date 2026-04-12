// https://codeforces.com/problemset/problem/1909/B

import java.util.*;
import java.io.*;

public class B_Make_Almost_Equal_With_Mod {

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
        Set<Long> set = new HashSet<>();
        long max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            set.add(a[i]);
            max = Math.max(max, a[i]);
        }

        if (set.size() == 2) {
            out.println((long) 1e18);
            return;
        }

        long l = 2, r = max;
        while (l <= r) {
            long mid = l + (r - l) / 2;

            if (ok(a, mid)) {
                out.println(mid);
                return;
            }
        }

        out.flush();
    }

    private static boolean ok(long[] a, long m) {
        Set<Long> set = new HashSet<>();

        for(long x : a) {
            set.add(x % m);
        }

        return set.size() == 2;
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