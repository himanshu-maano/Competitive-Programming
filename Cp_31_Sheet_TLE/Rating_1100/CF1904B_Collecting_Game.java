// https://codeforces.com/problemset/problem/1904/B

import java.util.*;
import java.io.*;

public class CF1904B_Collecting_Game {

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
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextLong();
            a[i][1] = i;
        }

        Arrays.sort(a, (x, y) -> Long.compare(x[0], y[0]));

        long[] prefix = new long[n];
        prefix[0] = a[0][0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i][0];
        }

        long[] ans = new long[n];
        ans[(int) a[n - 1][1]] = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            ans[(int)a[i][1]] = (prefix[i] >= a[i+1][0]) ? ans[(int)a[i+1][1]] : i; 
        }

        for(long y : ans) {
            out.print(y + " ");
        }

        out.println();
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