import java.util.*;
import java.io.*;

public class D_Absolute_Cinema {

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
        long[] f = new long[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextLong();
        }

        long[] a = new long[n];

        long sum = (f[0] + f[n-1]) / (n - 1);

        a[0] = (f[1] - f[0] + sum) / 2;
        a[n-1] = (sum - (f[n-1] - f[n - 2])) / 2;

        for (int i = 1; i < n - 1; i++) {
            a[i] = (f[i - 1] - 2 * f[i] + f[i + 1]) / 2;
        }

        for (long x : a) {
            out.print(x + " ");
        }

        out.println();

        out.flush();
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