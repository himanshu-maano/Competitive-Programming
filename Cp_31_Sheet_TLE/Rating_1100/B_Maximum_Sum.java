import java.util.*;
import java.io.*;

public class B_Maximum_Sum {
    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    // static final int size = 200001;
    // static

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    private static void mano() {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n+1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long[] pref = new long[n+1];
        for(int i=1; i<=n; i++) {
           pref[i] = pref[i-1] + a[i]; 
        }

        long max = 0;
        for(int i=0, j=0; i<=2*k; i+=2, j++) {
            long curr = pref[n-k+j] - pref[i];
            max = Math.max(max, curr);
        }

        System.out.println(max);

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
