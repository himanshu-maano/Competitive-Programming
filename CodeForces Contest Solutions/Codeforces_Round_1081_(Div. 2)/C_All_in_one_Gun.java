import java.util.*;
import java.io.*;

public class C_All_in_one_Gun {

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
        long h = sc.nextLong();
        long k = sc.nextLong();
        long[] a = new long[n];

        long prefix = 0;
        long[] suff = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            prefix += a[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            suff[i] = Math.max(suff[i + 1], a[i]);
        }

        long reload = 0;
        if (h % prefix == 0) {
            reload = (h / prefix) - 1;
        } else {
            reload = h / prefix;
        }

        long time = reload * (n + k);

        long min = (long) 1e12, curr = 0;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, a[i]);
            curr += a[i];

            long currMax = curr;

            if (i < n - 1) {
                currMax = Math.max(currMax, curr - min + suff[i + 1]);
            }

            if ((h - (reload * prefix)) - currMax <= 0L) {
                time += (i + 1);
                break;
            }
        }

        out.println(time);

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