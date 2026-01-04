import java.util.*;
import java.io.*;

public class B_New_Year_Cake {

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

        long way1 = way(a, b);
        long way2 = way(b, a);

        System.out.println(Math.max(way1, way2));

        out.flush();
    }

    static long way(long a, long b) {
        long layer = 0;
        long size = 1;
        while (true) {
            if ((layer & 1) == 0) {
                if (a >= size) {
                    a -= size;
                } else {
                    break;
                }
            } else {
                if (b >= size) {
                    b -= size;
                } else {
                    break;
                }
            }
            layer++;
            size += size;
        }

        return layer;
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