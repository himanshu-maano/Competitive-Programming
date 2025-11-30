import java.util.*;
import java.io.*;

public class A_Maximum_Neighborhood {

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

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(9);
        } else {
            int way1 = (n * n) + ((n * n) - 1) + ((n * n) - 2) + ((n * n) - (n + 1));
            int way2 = ((n * n) - 1) + ((n * n) - (n + 1 )) + ((n * n) - n) + (((n * n) - (n + 1) - n))
                    + ((n * n) - (n + 2));
            System.out.println(Math.max(way1, way2));
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