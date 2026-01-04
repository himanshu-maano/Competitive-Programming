import java.util.*;
import java.io.*;

public class E_Blackslex_and_Girls {

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
        long y = sc.nextLong();
        String s = sc.next();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }

        long a_Need = 0, b_Need = 0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '0') {
                a_Need += (a[i] / 2) + 1;
            } else {
                b_Need += (a[i] / 2) + 1;
            }
        }

        if(a_Need > x || b_Need > y || sum > x + y) {
            out.println("NO");
            return;
        }

        if(a_Need > 0 && b_Need > 0) {
            out.println("YES");
        } else if(a_Need > 0) {
            if(x >= y + n) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        } else {
            if(y >= x + n) {
                out.println("YES");
            } else {
                out.println("NO");
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