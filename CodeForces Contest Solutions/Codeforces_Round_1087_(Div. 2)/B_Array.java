import java.util.*;
import java.io.*;

public class B_Array {
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

        int[] temp = a.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();

        int val = 0;

        for (int x : temp) {
            if (!map.containsKey(x)) {
                map.put(x, val++);
            }
        }

        int[] ans = new int[n];

        Seg st = new Seg(val);

        for (int i = n - 1; i >= 0; i--) {
            int id = map.get(a[i]);

            int smaller = st.query(0, id - 1);
            int larger = st.query(id + 1, val - 1);

            ans[i] = Math.max(smaller, larger);
            st.update(id);
        }

        int i = 0, j = 1, d = something, cnt = 0;
        while (j < n) {
            while (i < j && a[j] >= a[i]) {
                i++;
            }

            while (i < j) {
                if (a[i] - a[j] >= d) {
                    cnt++;
                    i++;
                } else {
                    break;
                }
            }

            j++;
        }

        for (int x : ans) {
            out.print(x + " ");
        }
        out.println();

        out.flush();
    }

    static class Seg {
        int[] tree;
        int[] A;
        int n;

        Seg(int max) {
            n = max;
            tree = new int[4 * n];
        }

        public void update(int idx) {
            update(1, 0, n - 1, idx);
        }

        private void update(int node, int start, int end, int idx) {
            if (start == end) {
                tree[node] += 1;
            } else {
                int mid = start + (end - start) / 2;

                if (idx <= mid) {
                    update(2 * node, start, mid, idx);
                } else {
                    update(2 * node + 1, mid + 1, end, idx);
                }

                tree[node] = tree[2 * node] + tree[2 * node + 1];
            }
        }

        public int query(int l, int r) {
            return query(1, 0, n - 1, l, r);
        }

        private int query(int node, int start, int end, int l, int r) {
            if (r < start || l > end) {
                return 0;
            }

            if (l <= start && end <= r) {
                return tree[node];
            }

            int mid = start + (end - start) / 2;
            return query(2 * node, start, mid, l, r) + query(2 * node + 1, mid + 1, end, l, r);
        }
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
