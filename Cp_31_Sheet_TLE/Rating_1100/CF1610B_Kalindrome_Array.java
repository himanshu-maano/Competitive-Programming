// https://codeforces.com/problemset/problem/1610/B

import java.util.*;
import java.io.*;

public class CF1610B_Kalindrome_Array {

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

        boolean ok = true;

        for (int i = 0; i <= n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                ok = can(a, a[i]) || can(a, a[n - i - 1]);
                break;
            }
        }

        System.out.println(ok ? "YES" : "NO");

    }

    static boolean can(int[] a, int x) {
        List<Integer> l = new ArrayList<>();

        for (int num : a) {
            if (num != x) {
                l.add(num);
            }
        }

        int n = l.size();

        for (int i = 0; i <= n / 2; i++) {
            if (!l.get(i).equals(l.get(n - i - 1))) {
                return false;
            }
        }

        return true;
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