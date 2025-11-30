import java.util.*;
import java.io.*;

public class C_Dungeon {

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
        int m = sc.nextInt();
        int[] a = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        int[] b = new int[m];
        int[] c = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        List<Pair> exchange = new ArrayList<>();
        List<Integer> nonExchange = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            c[i] = sc.nextInt();
            if (c[i] != 0) {
                exchange.add(new Pair(b[i], c[i]));
            } else {
                nonExchange.add(b[i]);
            }
        }

        Collections.sort(exchange, (p1, p2) -> Integer.compare(p1.m, p2.m));

        Collections.sort(nonExchange);

        int cnt = 0;

        for (Pair p : exchange) {
            int mon = p.m;
            int reward = p.sword;

            Integer toKill = map.ceilingKey(mon);

            if (toKill != null) {
                cnt++;

                map.put(toKill, map.getOrDefault(toKill, 0) - 1);
                if (map.get(toKill) <= 0) {
                    map.remove(toKill);
                }

                if (reward >= toKill) {
                    map.put(reward, map.getOrDefault(reward, 0) + 1);
                } else {
                    map.put(toKill, map.getOrDefault(toKill, 0) + 1);
                }
            }
        }

        for (int mon : nonExchange) {
            Integer toKill = map.ceilingKey(mon);

            if (toKill == null) {
                break;
            } else {
                cnt++;
                map.put(toKill, map.getOrDefault(toKill, 0) - 1);
                if (map.get(toKill) <= 0) {
                    map.remove(toKill);
                }
            }
        }

        System.out.println(cnt);
    }

    static class Pair {
        int m;
        int sword;

        Pair(int m, int sword) {
            this.m = m;
            this.sword = sword;
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