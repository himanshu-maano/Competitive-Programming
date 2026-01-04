import java.util.*;
import java.io.*;

public class C_Odd_Process {

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
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        List<Long> even = new ArrayList<>();
        List<Long> odd = new ArrayList<>();

        for (long x : a) {
            if ((x & 1) == 1) {
                odd.add(x);
            } else {
                even.add(x);
            }
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        int o = odd.size();
        int e = even.size();

        if (o == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(0 + " ");
            }
            System.out.println();
            return;
        }

        long[] evenSum = new long[e + 1];

        for (int i = 1; i <= e; i++) {
            evenSum[i] = evenSum[i - 1] + even.get(i-1);
        }

        long[] ans = new long[n];

        for(int k=1; k<=n; k++) {
            long sum = odd.get(0);
            if(k - 1 <= e) {
                sum += evenSum[k - 1];
            } else {
                int extra = k - 1 - e;

                if((extra & 1) == 0) {
                    sum += evenSum[e];
                } else if(extra + 1 <= o - 1 && e > 0) {
                    sum += evenSum[e - 1];
                } else {
                    sum = 0;
                }
            }
            ans[k-1] = sum;
        }

        for(long x : ans) {
            out.print(x + " ");
        }
        out.println();

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

