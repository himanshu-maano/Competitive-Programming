import java.util.*;
import java.io.*;

public class AConvergence {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.println(ans.toString());
        out.close();
    }

    private static void mano() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int cnt = 0;
        if ((n & 1) == 1) {
            int l = 0, r = 0;
            for (int i = 0; i < n / 2; i++) {
                if (a[i] != a[n / 2]) {
                    l++;
                }
                if (a[n - i - 1] != a[n / 2]) {
                    r++;
                }
            }
            cnt = Math.max(l, r);
        } else {
            cnt = 101;
            for (int idx : new int[] { n / 2, n / 2 - 1 }) {
                int cntl = 0, cntr = 0;
                for (int i = 0; i < idx; i++) {
                    if (a[i] != a[idx]) {
                        cntl++;
                    }
                }

                for (int i = idx + 1; i < n; i++) {
                    if (a[i] != a[idx]) {
                        cntr++;
                    }
                }
                cnt = Math.min(cnt, Math.max(cntl, cntr));
            }

        }

        ans.append(cnt);

        ans.append("\n");
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