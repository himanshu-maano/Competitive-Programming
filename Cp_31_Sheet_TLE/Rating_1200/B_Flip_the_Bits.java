import java.util.*;
import java.io.*;

public class B_Flip_the_Bits {

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
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        int[] zero = new int[n + 1];
        int[] one = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            zero[i] = (a[i - 1] == '0') ? zero[i - 1] + 1 : zero[i - 1];
            one[i] = (a[i - 1] == '1') ? one[i - 1] + 1 : one[i - 1];
        }

        boolean flip = false, ok = true;

        for (int i = n - 1; i >= 0; i--) {
            if (!flip) {
                if (a[i] != b[i]) {
                    if (one[i + 1] != zero[i + 1]) {
                        ok = false;
                        break;
                    } else {
                        flip = true;
                    }
                }
            } else {
                if (a[i] == b[i]) {
                    if (one[i + 1] != zero[i + 1]) {
                        ok = false;
                        break;
                    } else {
                        flip = false;
                    }
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