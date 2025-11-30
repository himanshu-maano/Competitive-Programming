import java.util.*;
import java.io.*;

public class C_Symmetrical_Polygons {

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
        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        List<Long> odd = new ArrayList<>();
        long ans = 0;
        for (long x : map.keySet()) {
            if ((map.get(x) & 1) == 1) {
                odd.add(x);
            }
            ans += (map.get(x) / 2) * 2 * x;
        }

        if (ans == 0) {
            System.out.println(0);
            return;
        }

        long finans = ans;
        Collections.sort(odd);
        int m = odd.size();
        for (int i = 0; i < m; i++) {
            if (odd.get(i) < ans) {
                finans = Math.max(finans, ans + odd.get(i));
            }
            if (i < m-1 && odd.get(i + 1) - odd.get(i) < ans) {
                finans = Math.max(finans, ans + odd.get(i) + odd.get(i + 1));
            }
        }

        if(finans == ans && m == n-2) {
            System.out.println(0);
        } else {
            System.out.println(finans);
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