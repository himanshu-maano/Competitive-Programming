import java.util.*;
import java.io.*;

public class B_XOR_Array {

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
        int l = sc.nextInt();
        int r = sc.nextInt();

        //this is xor array
        long[] p = new long[n+1];

        //this is actual array.
        long[] ans = new long[n];

        long s = 10;
        for (int i = 0; i <= n; i++) {
            p[i] = s;
            s += 10;
        }

        p[r] = p[l-1];

        for(int i=0; i<n; i++) {
            ans[i] = p[i] ^ p[i+1];
        }

        for (long x : ans) {
            out.print(x + " ");
        }
        out.println();
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