// https://codeforces.com/problemset/problem/1791/E

import java.util.*;
import java.io.*;

public class CF1791E_Negatives_and_Positives {

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
        boolean zero = false;
        long neg = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 0) {
                zero = true;
            } else if (a[i] < 0) {
                neg++;
            }
            sum += Math.abs(a[i]);
        }

        if (zero || (neg & 1) == 0) {
            out.println(sum);
        } else {
            Arrays.sort(a);

            if (neg == 1) {
                sum = Math.max(sum - 2 * a[1], sum + 2 * a[0]);
            } else if (neg == n) {
                sum = sum + 2 * a[n-1];
            } else {
                int i = 0;
                for (; i < n; i++) {
                    if (a[i] > 0) {
                        break;
                    }
                }
                sum = Math.max(sum + 2 * a[i-1], sum - 2 * a[i]);
            }

            out.println(sum);
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