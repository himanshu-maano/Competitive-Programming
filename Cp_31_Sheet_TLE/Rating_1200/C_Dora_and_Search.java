import java.util.*;
import java.io.*;

public class C_Dora_and_Search {

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
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l = 1, r = n;

        for (int i = 0, j = n - 1; i < j;) {
            boolean ok = true;
            if (a[i] == l) {
                l++;
                i++;
                ok = false;
            } else if (a[i] == r) {
                r--;
                i++;
                ok = false;
            }

            if (a[j] == l) {
                l++;
                j--;
                ok = false;
            } else if (a[j] == r) {
                r--;
                j--;
                ok = false;
            }

            if (ok) {
                out.println((i + 1) + " " + (j + 1));
                return;
            }
        }

        out.println(-1);

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