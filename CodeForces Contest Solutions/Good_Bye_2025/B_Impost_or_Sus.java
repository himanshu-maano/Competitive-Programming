import java.util.*;
import java.io.*;

public class B_Impost_or_Sus {

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
        String s = sc.next();

        int n = s.length();

        char[] arr = s.toCharArray();
        int ans = 0;
        if (s.charAt(0) != 's') {
            ans++;
            arr[0] = 's';
        }
        if (s.charAt(n - 1) != 's') {
            ans++;
            arr[n-1] = 's';
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] == 'u') {
                if (arr[i-1] != 's') {
                    ans++;
                    arr[i-1] = 's';
                }
                if (arr[i+1] != 's') {
                    ans++;
                    arr[i+1] = 's';
                }
            }
        }

        out.println(ans);

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