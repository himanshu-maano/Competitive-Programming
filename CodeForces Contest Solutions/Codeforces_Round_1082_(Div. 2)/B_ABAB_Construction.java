import java.util.*;
import java.io.*;

public class B_ABAB_Construction {

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
        char[] s = sc.next().toCharArray();

        boolean ok = true;

        if ((n & 1) == 0) {
            for (int i = 0; i < n; i += 2) {
                if (s[i] != '?' && s[i] == s[i + 1]) {
                    ok = false;
                }
            }
        } else {
            if (s[0] == 'b') {
                ok = false;
            }

            for (int i = 1; i < n; i += 2) {
                if (s[i] != '?' && s[i] == s[i + 1]) {
                    ok = false;
                }
            }
        }

        out.println(ok ? "YES" : "NO");

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