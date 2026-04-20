import java.util.*;
import java.io.*;

public class D_1_Unique_Values_Easy_version {

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

        int l = 1, h = 2 * n + 1, idx3 = h;

        while (l <= h) {
            int m = l + ((h - l) >> 1);
            if ((query(generate(m)) & 1) != (m & 1)) {
                idx3 = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        l = 1;
        h = idx3 - 1;
        int idx1 = h;

        while (l <= h) {
            int m = l + ((h - l) >> 1);
            List<Integer> list = generate(m);
            int d1 = query(list);
            list.add(idx3);
            int d2 = query(list);
            if (d2 - d1 <= 0) {
                idx1 = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        l = idx1 + 1;
        h = idx3 - 1;
        int idx2 = h;

        while (l <= h) {
            int m = l + ((h - l) >> 1);
            List<Integer> list = generate(m);
            int d1 = query(list);
            list.add(idx3);
            int d2 = query(list);
            if (d2 - d1 == 0) {
                idx2 = m;
                h = m - 1;
            } else {
                l = m + 1;
            }
        }

        out.println("! " + idx1 + " " + idx2 + " " + idx3);

        out.flush();
    }

    private static List<Integer> generate(int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            list.add(i);
        }
        return list;
    }

    private static int query(List<Integer> list) {
        out.print("? " + list.size() + " ");
        for (int x : list) {
            out.print(x + " ");
        }
        out.println();
        out.flush();

        int c = sc.nextInt();
        return c;
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