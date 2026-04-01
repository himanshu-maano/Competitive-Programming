import java.util.*;
import java.io.*;

public class E_Product_Queries {

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
        int[] a = new int[n];
        int[] seive = new int[n + 1];
        Arrays.fill(seive, (int)1e9);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            seive[a[i]] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (seive[i] == 1) {
                for (int j = i * 2; j <= n; j += i) {
                    if (seive[j / i] != (int) 1e9) {
                        seive[j] = Math.min(seive[j], seive[j / i] + 1);
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if(seive[i] == (int)1e9) {
                out.print(-1 + " ");
            } else {
                out.print(seive[i] + " ");
            }
        }
        out.println();

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