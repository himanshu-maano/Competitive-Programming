// https://codeforces.com/problemset/problem/1842/B

import java.util.*;
import java.io.*;

public class CF1842B_Tenzing_and_Books {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static int[] a = new int[100001];
    static int[] b = new int[100001];
    static int[] c = new int[100001];

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    private static void mano() {
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        if (x == 0) {
            System.out.println("Yes");
            return;
        }

        int msb = 31 - Integer.numberOfLeadingZeros(x);

        int z = 0;
        for (int i = 0; i <= msb; i++) {
            if (((x >> i) & 1) == 0) {
                z |= (1 << i);
            }
        }

        boolean ok = false, check = true;

        int i = 0, j = 0, k = 0;
        int score = 0;
        while (check) {
            check = false;
            if (i < n) {
                if ((a[i] & ~x) == 0) {
                    score |= a[i];
                    i++;
                    check = true;
                }
            }

            if (j < n) {
                if ((b[j] & ~x) == 0) {
                    score |= b[j];
                    j++;
                    check = true;
                }
            }

            if (k < n) {
                if ((c[k] & ~x) == 0) {
                    score |= c[k];
                    k++;
                    check = true;
                }
            }

            if (score == x) {
                ok = true;
                break;
            }
        }

        out.println(ok ? "Yes" : "No");
        out.flush();

        for (int l = 0; l < n; l++) {
            a[l] = 0;
            b[l] = 0;
            c[l] = 0;
        }
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
