import java.util.*;
import java.io.*;

public class C_Restricted_Sorting {

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
        int[] a = new int[n];
        boolean ok = true;
        long max = 0, min = (long) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
            if (i > 0 && a[i] < a[i - 1]) {
                ok = false;
            }
        }

        if (ok) {
            out.println(-1);
            return;
        }

        long s = 1, e = max - min;

        int[] b = Arrays.copyOf(a, n);
        Arrays.sort(b);

        while (s <= e) {
            long k = s + (e - s) / 2;

            if (check(a, b, k, min, max)) {
                s = k + 1;
            } else {
                e = k - 1;
            }
        }

        out.println(e);

        out.flush();
    }

    private static boolean check(int[] a, int[] b, long k, long min, long max) {
        for (int i = 0; i < a.length; i++) {
            boolean ok = false;
            if (Math.abs(a[i] - min) >= k || Math.abs(a[i] - max) >= k) {
                ok = true;
            }

            if (!ok && a[i] != b[i]) {
                return false;
            }
        }

        return true;
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