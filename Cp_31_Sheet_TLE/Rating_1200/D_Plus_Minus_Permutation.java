import java.util.*;
import java.io.*;

public class D_Plus_Minus_Permutation {

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
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (x == y) {
            out.println(0L);
            return;
        }

        long xCnt = n / x;
        long yCnt = n / y;

        // The number of common multiples of x and y in the range [1, n]
        // is the total range divided by their (LCM).
        long commonCount = n / lcm(x, y);

        xCnt -= commonCount;
        yCnt -= commonCount;

        long xSum = sumOfN(n) - sumOfN(n - xCnt);
        long ySum = sumOfN(yCnt);

        long ans = xSum - ySum;

        out.println(ans);

        out.flush();
    }

    private static long sumOfN(long n) {
        return (n * (n + 1)) / 2L;
    }

    private static long gcd(long a, long b) {
        if (a == 0L) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static long lcm(long a, long b) {
        if (a == 0 || b == 0)
            return 0;
        return (a * b) / gcd(a, b);
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