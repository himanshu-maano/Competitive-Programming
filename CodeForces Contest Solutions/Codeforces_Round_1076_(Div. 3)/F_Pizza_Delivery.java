import java.util.*;
import java.io.*;

public class F_Pizza_Delivery {

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
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();

        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i][1] = sc.nextInt();
        }

        int tempAy = ay;
        Arrays.sort(a, (x, y) -> {
            int cmp = Integer.compare(x[0], y[0]);
            if (cmp == 0) {
                return Integer.compare(Math.abs(x[1] - ay), Math.abs(y[1] - ay));
            }
            return cmp;
        });

        long time = 0;

        for (int i = 0; i < n; i++) {
            time += Math.abs(a[i][0] - ax);
            time += Math.abs(a[i][1] - tempAy);
            ax = a[i][0];
            tempAy = a[i][1];
        }

        time += Math.abs(ax - bx) + Math.abs(tempAy - by);

        out.println(time);

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