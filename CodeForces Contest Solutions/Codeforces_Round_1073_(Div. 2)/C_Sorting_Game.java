import java.util.*;
import java.io.*;

public class C_Sorting_Game {

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

        List<Integer> ans = new ArrayList<>();

        boolean ok = true;
        int cnt0 = (a[0] == '0') ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                ok = false;
            }
            if (a[i] == '0') {
                cnt0++;
            }
        }
        for (int i = 0; i < cnt0; i++) {
            if (a[i] == '1') {
                ans.add(i);
            }
        }

        for (int i = cnt0; i < n; i++) {
            if (a[i] == '0') {
                ans.add(i);
            }
        }

        if (ok) {
            out.println("Bob");
        } else {
            out.println("Alice");
            out.println(ans.size());
            for (int x : ans) {
                out.print((x + 1) + " ");
            }
            out.println();
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