import java.util.*;
import java.io.*;

public class B_Bitwise_Reversion {

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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int a = 0, b = 0, c = 0;

        for (int i = 0; i < 30; i++) {
            if ((x >> i & 1) == 1) {
                a = a | (1 << i);
                b = b | (1 << i);
            }
            if ((y >> i & 1) == 1) {
                b |= (1 << i);
                c |= (1 << i);
            }
            if ((z >> i & 1) == 1) {
                a |= (1 << i);
                c |= (1 << i);
            }
        }

        if ((a & b) == x && (b & c) == y && (c & a) == z) {
            out.println("YES");
        } else {
            out.println("NO");
        }

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