import java.util.*;
import java.io.*;

public class B_Flipping_Binary_String {
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
        char[] a = sc.next().toCharArray();

        int cnt0 = 0, cnt1 = 0;
        for (char c : a) {
            if (c == '1') {
                cnt1++;
            } else {
                cnt0++;
            }
        }

        if(cnt1 == 0) {
            out.println(0);
            return;
        }

        if((cnt1 & 1) == 0) {
            out.println(cnt1);
            for(int i=0; i<n; i++) {
                if(a[i] == '1') {
                    out.print((i + 1) + " ");
                }
            }
        } else if((cnt0 & 1) == 1) {
            out.println(cnt0);
            for(int i=0; i<n; i++) {
                if(a[i] == '0') {
                    out.print((i + 1) + " ");
                }
            }
        } else {
            out.print(-1);
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