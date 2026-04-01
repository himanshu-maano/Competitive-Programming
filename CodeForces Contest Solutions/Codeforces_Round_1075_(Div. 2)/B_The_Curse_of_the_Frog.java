import java.util.*;
import java.io.*;

public class B_The_Curse_of_the_Frog {

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
        long x = sc.nextLong();
        // long[][] a = new long[n][2];

        long free = 0, largestSingleJump = -(long) 1e18;
        for (int i = 0; i < n; i++) {
            long ai = sc.nextLong();
            long bi = sc.nextLong();
            long ci = sc.nextLong();

            free += ((ai * bi) - ai);
            largestSingleJump = Math.max(largestSingleJump, (ai * bi) - ci);

        }

        if (free >= x) {
            out.println(0);
            return;
        }

        if (largestSingleJump < 1) {
            out.println(-1);
            return;
        }

        long remainDis = x - free;

        out.println((remainDis + largestSingleJump - 1) / largestSingleJump);

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