import java.util.*;
import java.io.*;

public class C_Make_Them_Equal {

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
        char c = sc.next().charAt(0);
        String s = sc.next();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                cnt++;
            }
        }

        if (cnt == n) {
            out.println(0);
            return;
        }

        int i = n - 1;
        while (i >= 0 && s.charAt(i) != c) {
            i--;
        }

        if (i == -1 || (n - i - 1) >= i + 1) {
            out.println(2);
            out.println(n - 1 + " " + n);
        } else {
            out.println(1);
            out.println(i + 1);
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