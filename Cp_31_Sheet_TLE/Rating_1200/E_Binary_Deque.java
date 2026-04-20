import java.util.*;
import java.io.*;

public class E_Binary_Deque {

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
        int s = sc.nextInt();
        int[] a = new int[n];
        int tot = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            tot += a[i];
        }

        if (tot < s) {
            out.println(-1);
            return;
        }

        int i=0, j=n-1, curr = tot, ans = 0;

        for(; i<n; i++) {
            curr -= a[i];
            if(curr == s) {
                ans = i + 1;
                break;
            }
        }

        while(j >= 0) {
            while(i >= 0) {
                curr -= a[i];
                if(curr < s - 1) {
                    break;
                }
                i--;
            }
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