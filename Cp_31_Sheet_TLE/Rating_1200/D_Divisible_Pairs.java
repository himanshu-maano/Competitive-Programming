import java.util.*;
import java.io.*;

public class D_Divisible_Pairs {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    private static void mano() {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Map<String, Long> map = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            String p = (a[i] % x) + "_" + (a[i] % y);
            String tar = (x - (a[i] % x)) % x + "_" + (a[i] % y);
            // System.out.println(p + " " + tar);
            if (map.containsKey(tar)) {
                ans += map.get(tar);
            }
            map.put(p, map.getOrDefault(p, 0L) + 1);
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