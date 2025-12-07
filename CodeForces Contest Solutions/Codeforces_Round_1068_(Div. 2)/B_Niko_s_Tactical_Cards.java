import java.util.*;
import java.io.*;

public class B_Niko_s_Tactical_Cards {

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

        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long ans1 = -a[0];
        long ans2  = b[0];

        if(ans1 < ans2) {
            ans1 = ans1 ^ ans2;
            ans2 = ans1 ^ ans2;
            ans1 = ans1 ^ ans2;
        }

        for (int i = 1; i < n; i++) {
            long next_max = Math.max(ans1 - a[i], b[i] - ans2);
            long next_min = Math.min(ans2  - a[i], b[i] - ans1);

            ans1 = next_max;
            ans2 = next_min;
        }

        System.out.println(Math.max(ans1, ans2));

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