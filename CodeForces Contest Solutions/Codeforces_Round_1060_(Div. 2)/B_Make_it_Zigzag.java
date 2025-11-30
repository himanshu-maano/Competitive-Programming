import java.util.*;
import java.io.*;

public class B_Make_it_Zigzag {

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

        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
            if ((i & 1) == 1) {
                a[i] = max;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i += 2) {
            long diff = 0;
            if (i > 0) {
                diff = Math.max((a[i] - a[i - 1] + 1), 0);
            }
            if (i < n - 1) {
                diff = Math.max((a[i] - a[i + 1] + 1), diff);
            }
            ans += diff;
            a[i] -= diff;
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