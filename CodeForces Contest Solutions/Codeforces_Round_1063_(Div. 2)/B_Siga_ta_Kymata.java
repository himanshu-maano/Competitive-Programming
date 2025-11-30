import java.util.*;
import java.io.*;

public class B_Siga_ta_Kymata {

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

        char[] s = sc.next().toCharArray();

        if(s[0] == '1' || s[n-1] == '1') {
            System.out.println(-1);
            return;
        }

        int x = -1, y = -1;
        for(int i=0; i<n; i++) {
            if(s[i] == '1' && (a[i] == 1 || a[i] == n)) {
                System.out.println(-1);
                return;
            }

            if(a[i] == 1) {
                x = i + 1;
            } 

            if(a[i] == n) {
                y = i + 1;
            }
        }

        if(x > y) {
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
        }


        System.out.println(5);
        System.out.println(1 + " " + x);
        System.out.println(x + " " + n);
        System.out.println(1 + " " + y);
        System.out.println(y + " " + n);
        System.out.println(x + " " + y);

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