import java.util.*;
import java.io.*;

public class D_Yet_Another_Array_Problem {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    // static final int size = 40000005;
    // static

    public static void main(String[] args) throws IOException {
        sieve();
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    static boolean[] prime;
    static int N = (int) 1e5;

    static void sieve() {
        prime = new boolean[N + 1];
        for (int i = 0; i <= N; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= N; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= N; i += p)
                    prime[i] = false;
            }
        }
    }

    private static void mano() {
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for(int i=2; i<=N; i++) {
            boolean ok = false;

            if(prime[i]) {
                for(long x : a) {
                    if(x % i != 0) {
                        ok = true;
                    }
                }
            }

            if(ok) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);

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