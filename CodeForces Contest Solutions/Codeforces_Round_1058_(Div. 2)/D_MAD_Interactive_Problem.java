import java.util.*;
import java.io.*;

public class D_MAD_Interactive_Problem {
    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }
    
    static int query(List<Integer> l) {
        System.out.print("? " + l.size() + " ");
        for(int x : l) {
            System.out.print(x + " ");
        }
        System.out.flush();

        int ans = sc.nextInt();
        return ans;
    }

    private static void mano() {
        int n = sc.nextInt();
        
        List<Integer> idx = new ArrayList<>();
        int[] ans = new int[2*n + 1];

        for(int i=1; i<=2*n; i++) {
            idx.add(i);
            int value = query(idx);
            if(value > 0) {
                ans[i] = value;
                idx.remove(idx.size() - 1);
            }
        }

        idx.clear();
        for(int i=2*n; i>=1; i--) {
            idx.add(i);
            if(ans[i] == 0) {
                ans[i] = query(idx);
                idx.remove(idx.size() - 1);
            }
        }
        System.out.print("! ");
        for(int i=1; i<=2*n; i++) {
            System.out.print(ans[i] + " ");
        }
    
        System.out.flush();
    
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