import java.util.*;
import java.io.*;

public class C_1_No_Cost_Too_Great_Easy_Version {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static final int size = 200001;
    static int[] a = new int[size + 5];
    static int[] b = new int[size + 5];

    public static void main(String[] args) throws IOException {
        sieve();
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    static int[] spf;
    static int N = 200001;
    static int[] cnt = new int[N + 5];

    static void sieve() {
        spf = new int[N];
        for (int i = 1; i < N; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i < N; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < N; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
    }

    private static void mano() {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int ans = 2;

        for (int x : a) {
            int temp = x;
            while (temp > 1) {
                int pf = spf[temp];
                if (++cnt[pf] > 1) {
                    ans = 0;
                }
                while (temp % pf == 0) {
                    temp /= pf;
                }
            }
        }

        if (ans != 0) {
            for (int i = 0; i < n; i++) {
                int temp = a[i] + 1;
                while (temp > 1) {
                    int pf = spf[temp];
                    if (cnt[pf] > 0) {
                        ans = 1;
                    }
                    while (temp % pf == 0) {
                        temp /= pf;
                    }
                }
            }
        }

        //free space
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            while (temp > 1) {
                int pf = spf[temp];
                cnt[pf] = 0;
                while (temp % pf == 0) {
                    temp /= pf;
                }
            }
        }

        out.println(ans);

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