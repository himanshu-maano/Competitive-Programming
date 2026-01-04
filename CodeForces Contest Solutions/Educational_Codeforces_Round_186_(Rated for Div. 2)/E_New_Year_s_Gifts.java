import java.util.*;
import java.io.*;

public class E_New_Year_s_Gifts {

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
        int m = sc.nextInt();
        long k = sc.nextLong();

        int[] a = new int[m];
        int max_box = 0;
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            max_box = Math.max(max_box, a[i]);
        }

        long[][] b = new long[n][3];
        long total = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            b[i][0] = x;
            b[i][1] = y;
            b[i][2] = z;
            total += y;
        }

        long extra = k - total;

        long ans = 0;
        List<Long> diff = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (max_box >= b[i][0]) {
                ans++;
            } else {
                diff.add(b[i][2] - b[i][1]);
            }
        }

        Collections.sort(diff);
        for (int i = 0; i < diff.size(); i++) {
            if (extra >= diff.get(i)) {
                ans++;
                extra -= diff.get(i);
            } else {
                break;
            }
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