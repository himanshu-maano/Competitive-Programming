import java.util.*;
import java.io.*;

public class D_Beautiful_Permutation {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    static int ask(int type, int l, int r) {
        System.out.println(type + " " + l + " " + r);
        System.out.flush();

        int sum = sc.nextInt();

        return sum;
    }

    private static void mano() {
        int n = sc.nextInt();

        int diff = ask(2, 1, n) - ask(1, 1, n);
        int l = 1, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sum1 = ask(1, 1, mid);
            int sum2 = ask(2, 1, mid);
            if (sum1 == sum2) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println("!" + " " + l + " " + (l + diff - 1));
        System.out.flush();

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