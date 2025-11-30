import java.util.*;
import java.io.*;

public class D_Binary_String_To_Subsequences {

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
        char[] a = sc.next().toCharArray();

        int[] ans = new int[n];

        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pos = l0.size() + l1.size() + 1;
            if (a[i] == '0') {
                if (l1.isEmpty()) {
                    l0.add(pos);
                } else {
                    pos = l1.get(l1.size() - 1);
                    l1.remove(l1.size() - 1);
                    l0.add(pos);
                }
            } else {
                if (l0.isEmpty()) {
                    l1.add(pos);
                } else {
                    pos = l0.get(l0.size() - 1);
                    l0.remove(l0.size() - 1);
                    l1.add(pos);
                }
            }
            ans[i] = pos;
        }

        System.out.println(l0.size() + l1.size());
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
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
