import java.util.*;
import java.io.*;

public class C_Maximum_GCD_on_Whiteboard {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static final int size = (int)2e5+1;
    static int[] a = new int[size];

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

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] f = new int[n + 1];
        for (int i = 0; i < n; i++) {
            f[a[i]]++;
        }

        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + f[i];
        }

        int ans = n;
        while (ans > 1) {
            int max = Math.min(n, 4 * ans - 1);

            int x = prefix[max];

            for (int i = ans; i <= max; i += ans) {
                x -= f[i];
            }

            if (x <= k) {
                break;
            }
            ans--;
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