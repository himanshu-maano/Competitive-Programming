import java.util.*;
import java.io.*;

public class EScuza {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.print(ans.toString());
        out.close();
    }

    private static void mano() {
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[n];
        for (int i = 1; i <= n; i++) {
            a[i - 1] = sc.nextLong();
        }

        long[] pre = new long[n];
        long[] preMax = new long[n];
        preMax[0] = a[0];
        pre[0] = a[0];
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(preMax[i - 1], a[i]);
            pre[i] = pre[i - 1] + a[i];
        }

        long[] ques = new long[q];
        for (int i = 0; i < q; i++) {
            ques[i] = sc.nextLong();
        }

        for (int i = 0; i < q; i++) {
            int idx = bs(ques[i], preMax);
            ans.append((idx == -1 ? 0 : pre[idx])).append(' ');
        }

        ans.append('\n');
    }

    static int bs(long tar, long[] a) {
        int l = 0, h = a.length - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;

            if (a[m] <= tar) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return h;
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

