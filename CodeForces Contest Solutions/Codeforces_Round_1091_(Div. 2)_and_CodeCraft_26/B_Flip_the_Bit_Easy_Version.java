import java.util.*;
import java.io.*;

public class B_Flip_the_Bit_Easy_Version {

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
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = sc.nextInt();
        }

        int op1 = 0;
        for (int i=0; i < b[0]; i++) {
            if ((op1 & 1) == 0) {
                if (a[i] != a[b[0] - 1]) {
                    op1++;
                }
            } else {
                if (a[i] == a[b[0] - 1]) {
                    op1++;
                }
            }
        }

        int op2 = 0;
        for (int j=n-1; j >= b[0] - 1; j--) {
            if ((op2 & 1) == 0) {
                if (a[j] != a[b[0] - 1]) {
                    op2++;
                }
            } else {
                if (a[j] == a[b[0] - 1]) {
                    op2++;
                }
            }
        }

        out.println(Math.max(op1, op2));

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