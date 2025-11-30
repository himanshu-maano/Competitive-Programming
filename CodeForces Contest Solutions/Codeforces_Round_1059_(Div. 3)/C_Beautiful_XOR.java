import java.util.*;
import java.io.*;

public class C_Beautiful_XOR {

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
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == b) {
            System.out.println(0);
            return;
        }

        if ((a ^ b) <= a) {
            System.out.println(1 + "\n" + (a ^ b));
            return;
        } else {
            long xor = a ^ b;

            long x1 = xor - (a - 1);
            long x2 = xor - x1;
            if (x1 > a || x2 > (a ^ x1)) {
                System.out.println(-1);
            } else {
                System.out.println(2 + "\n" + x1 + " " + x2);
            }
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