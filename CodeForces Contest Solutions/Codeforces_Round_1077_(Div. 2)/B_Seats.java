import java.util.*;
import java.io.*;

public class B_Seats {

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
        String s = sc.next();

        long ans = 0;
        for (int i = 0; i < n;) {
            if (s.charAt(i) == '1') {
                i++;
                ans++;
                continue;
            }
            int j = i;
            while (j < n && s.charAt(j) == '0') {
                j++;
            }

            int len = j - i;
            if (len == n) {
                out.println((len + 2) / 3);
                return;
            }

            if (i == 0 || j == n) {
                ans += (len + 1) / 3;
            } else {
                ans += (len / 3);
            }

            i = j;
        }

        out.println(ans);

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