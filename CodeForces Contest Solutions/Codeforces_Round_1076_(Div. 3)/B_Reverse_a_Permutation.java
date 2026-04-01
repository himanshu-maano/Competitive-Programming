import java.util.*;
import java.io.*;

public class B_Reverse_a_Permutation {

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
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = n, s = -1, e = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                t--;
            } else {
                s = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                e = i;
                break;
            }
        }

        if (s != -1 && e != -1) {
            for(int i=0; i<s; i++) {
                out.print(a[i] + " ");
            }
            for (int i = e; i >= s; i--) {
                out.print(a[i] + " ");
            }
            for(int i=e+1; i<n; i++) {
                out.print(a[i] + " ");
            }
        } else {
            for (int x : a) {
                out.print(x + " ");
            }
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