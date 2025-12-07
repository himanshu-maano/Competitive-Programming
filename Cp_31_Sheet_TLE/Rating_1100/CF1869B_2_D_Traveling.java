// https://codeforces.com/problemset/problem/1869/B

import java.util.*;
import java.io.*;

public class CF1869B_2_D_Traveling {

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
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        long[][] city = new long[n + 1][2];
        int i = 1;
        while (n-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            city[i][0] = x;
            city[i][1] = y;
            i++;
        }

        long dis = Math.abs(city[a][0] - city[b][0]) + Math.abs(city[a][1] - city[b][1]);

        long mina = (long) 1e18, minb = (long) 1e18;
        for (int j = 1; j <= k; j++) {
            mina = Math.min(mina, Math.abs(city[a][0] - city[j][0]) + Math.abs(city[a][1] - city[j][1]));
            minb = Math.min(minb, Math.abs(city[b][0] - city[j][0]) + Math.abs(city[b][1] - city[j][1]));
        }

        System.out.println(Math.min(dis, mina + minb));

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