// https://codeforces.com/problemset/problem/1656/B

import java.util.*;
import java.io.*;

public class CF1656B_Subtract_Operation {

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
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        Map<Integer, Integer> map = new HashMap<>();

        /*
         * you can see sequence like we have array of [a1, a2, a3]
         * if we erase last element array will be [(a1 - a3), (a2 - a3)]
         * then again erase last then -> [(a1 - a3 - (a2 - a3))] -> it is same as
         * [(a1 - a3 - a2 + a3)] i.e [a1 - a2]...you can see when we erase any number
         * it cancel out previous erase number it means if we have two number
         * whose difference is k than we can always make arary only element as k...
         */
        boolean ok = false;
        /*
         * here we are using map to check if array contains any 2 num whose diff is k
         * i.e (a[i] - a[j] = k) => (a[i] - k = a[j]).
         */
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i] - k)) {
                ok = true;
            }
            map.put(a[i], i);
        }

        System.out.println(ok ? "YES" : "NO");

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