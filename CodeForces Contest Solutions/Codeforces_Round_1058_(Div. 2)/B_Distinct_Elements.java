import java.util.*;
import java.io.*;

public class B_Distinct_Elements {

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
        long[] a = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
        }

        long[] ans = new long[n + 1];

        long x = 1;

        for (int i = 1; i <= n; i++) {
            long idx = i - (a[i] - a[i - 1]);
            if (a[i] - a[i - 1] == i) {
                ans[i] = x++;
            } else {
                ans[i] = ans[(int) idx];
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }

        System.out.println();

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