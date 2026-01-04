import java.util.*;
import java.io.*;

public class C_First_or_Second {

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

        long[] pref = new long[n];
        long[] suff = new long[n + 1];

        pref[0] = Math.abs(a[0]);
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + Math.abs(a[i]);
        }

        suff[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] + a[i];
        }

        long ans = -suff[1];

        for (int i = 1; i < n; i++) {
            long left = a[0];
            if (i > 1) {
                left += pref[i - 1] - pref[0];
            }
            long right = suff[i + 1];

            ans = Math.max(ans, left - right);
        }

        out.println(ans);

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