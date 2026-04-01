import java.util.*;
import java.io.*;

public class E_Idiot_First_Search {

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

        int[] l = new int[n + 1];
        int[] r = new int[n + 1];
        int[] par = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();

            if (l[i] != 0)
                par[l[i]] = i;
            if (r[i] != 0)
                par[r[i]] = i;
        }

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> order = new ArrayList<>();

        queue.add(1);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            order.add(curr);

            if (l[curr] != 0)
                queue.add(l[curr]);
            if (r[curr] != 0)
                queue.add(r[curr]);
        }

        long[] dp = new long[n + 1];
        long MOD = (long)1e9 + 7;

        for (int i = order.size() - 1; i >= 0; i--) {
            int curr = order.get(i);

            if (l[curr] == 0 && r[curr] == 0) {
                dp[curr] = 1;
            } else {
                dp[curr] = (dp[l[curr]] + dp[r[curr]] + 3) % MOD;
            }
        }

        long[] ans = new long[n + 1];

        for (int i = 0; i < order.size(); i++) {
            int curr = order.get(i);

            if (curr == 1) {
                ans[curr] = dp[curr];
            } else {
                ans[curr] = (dp[curr] + ans[par[curr]]) % MOD;
            }
        }

        for(int i=1; i<=n; i++) {
            out.print(ans[i] + " ");
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