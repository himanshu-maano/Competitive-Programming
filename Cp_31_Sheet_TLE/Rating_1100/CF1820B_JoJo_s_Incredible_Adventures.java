// https://codeforces.com/problemset/problem/1820/B

import java.util.*;
import java.io.*;

public class CF1820B_JoJo_s_Incredible_Adventures {

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
        String s = sc.next();

        int n = s.length();

        if (n == 1) {
            System.out.println(s.charAt(0));
            return;
        }

        long len = 0, maxLen = 0;

        for (int i = 0; i < 2 * n; i++) {
            if (s.charAt(i % n) == '1') {
                len++;
            } else {
                len = 0;
            }
            maxLen = Math.max(len, maxLen);
        }

        if (maxLen <= 1) {
            System.out.println(maxLen);
        } else if (maxLen >= n) {
            System.out.println(1L * n * n);
        } else {
            long ans = 0;
            for (long i = maxLen, j = 1; i > maxLen / 2; i--, j++) {
                ans = Math.max(ans, i * j);
            }

            System.out.println(ans);
        }
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