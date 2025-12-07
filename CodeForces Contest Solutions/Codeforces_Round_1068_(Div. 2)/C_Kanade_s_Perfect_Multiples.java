import java.util.*;
import java.io.*;

public class C_Kanade_s_Perfect_Multiples {

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
        TreeSet<Integer> seen = new TreeSet<>();
        TreeSet<Integer> had = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            seen.add(x);
            had.add(x);
        }

        List<Integer> ans = new ArrayList<>();

        while(had.size() > 0) {
            int x = had.first();
            ans.add(x);
            for(int i=x; i<=k; i+=x) {
                if(seen.contains(i)) {
                    had.remove(i);
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(ans.size());
        for(int y : ans) {
            System.out.print(y + " ");
        }
        System.out.println();

        
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