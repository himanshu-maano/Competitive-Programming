import java.util.*;
import java.io.*;

public class Hourglass {

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
        long s = sc.nextLong();
        long k = sc.nextLong();
        long m = sc.nextLong();

        // if (k > m) {
        // out.println(Math.max(0, s - m));

        // } else {
        // long flip = m / k;
        // long have = Math.min(s , k);

        // if((flip & 1) == 0) {
        // have = s;
        // }
        // long r = m % k;
        // out.println(Math.max(0, have - r));
        // }

        if (k >= s) {
            if (m % k == 0) {
                System.out.println(s);
            } else {
                System.out.println(Math.max(0, s - (m % k)));
            }

        } else {
            long r = m % k;
            long flip = m / k;

            long cnt = (flip & 1) == 0 ? s : k;
            if (r == 0) {
                System.out.println(cnt);
            } else {
                System.out.println(cnt - r);
            }
        }

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