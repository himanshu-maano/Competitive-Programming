// https://codeforces.com/problemset/problem/1797/B

import java.util.*;
import java.io.*;

public class CF1797B_Li_Hua_and_Pattern {

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
        long k = sc.nextLong();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        if (n == 2) {
            int not_match = 0;
            if (a[0][0] != a[1][1]) {
                not_match++;
            }
            if (a[0][1] != a[1][0]) {
                not_match++;
            }

            out.println((k - not_match >= 0 && ((k - not_match) & 1) == 0) ? "YES" : "NO");
            return;
        }

        long not_match = 0;

        boolean ok = false;
        if ((n & 1) == 0) {
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[n - i - 1][n - j - 1]) {
                        not_match++;
                    }
                }
            }

            if ((k - not_match >= 0 && ((k - not_match) & 1) == 0)) {
                ok = true;
            }

        } else {
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[n - i - 1][n - j - 1]) {
                        not_match++;
                    }
                }
            }

            for (int j = 0; j < n / 2; j++) {
                if (a[n / 2][j] != a[n / 2][n - j - 1]) {
                    not_match++;
                }
            }

            if (k - not_match >= 0) {
                ok = true;
            }
        }

        out.println(ok ? "YES" : "NO");

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