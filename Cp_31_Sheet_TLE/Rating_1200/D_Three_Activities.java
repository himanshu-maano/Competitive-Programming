// https://codeforces.com/problemset/problem/1914/D

import java.util.*;
import java.io.*;

public class D_Three_Activities {

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

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }        

        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextLong();
        }
        List<Integer> l1 = max3(a);
        List<Integer> l2 = max3(b);
        List<Integer> l3 = max3(c);

        long ans = -1;

        for (int x : l1) {
            for (int y : l2) {
                if(x == y) continue;
                for (int z : l3) {
                    if (y == z || x == z) continue;
                    ans = Math.max(ans, a[x] + b[y] + c[z]);
                }
            }
        }

        out.println(ans);
        out.flush();
    }

    private static List<Integer> max3(long[] arr) {
        int n = arr.length;
        int m1 = -1, m2 = -1, m3 = -1;

        for(int i=0; i<n; i++) {
            if(m1 == -1 || arr[i] > arr[m1]) {
                m3 = m2;
                m2 = m1;
                m1 = i;
            } else if(m2 == -1 || arr[i] > arr[m2]) {
                m3 = m2;
                m2 = i;
            } else if(m3 == -1 || arr[i] > arr[m3]) {
                m3 = i;
            }
        }

        return new ArrayList<>(Arrays.asList(m1, m2, m3));
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