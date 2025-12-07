import java.util.*;
import java.io.*;

public class E_Shiro_s_Mirror_Duel {

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
        int[] p = new int[n + 1];
        int[] pos = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
            pos[p[i]] = i;
        }

        for (int i = 1; i <= n / 2; i++) {
            int l = i;
            int r = n - i + 1;

            while (p[l] != l || p[r] != r) {
                int u = pos[l];
                int v = pos[r];
                
                if (u == r && v == l) {
                    query(l, r, p, pos);
                } else if (p[l] == l) {
                    query(v, r, p, pos);
                } else {
                    query(u, l, p, pos);
                }
            }
        }
        out.println("!");
        out.flush();
    }

    private static void query(int x, int y, int[] p, int[] pos) {
        out.println("? " + x + " " + y);
        out.flush();

        int retU = sc.nextInt();
        int retV = sc.nextInt();

        if (retU == -1) System.exit(0);

        int val1 = p[retU];
        int val2 = p[retV];

        p[retU] = val2;
        p[retV] = val1;
        pos[val1] = retV;
        pos[val2] = retU;
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