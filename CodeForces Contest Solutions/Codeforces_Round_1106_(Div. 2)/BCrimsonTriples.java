import java.util.*;
import java.io.*;

public class BCrimsonTriples {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder ans = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.println(ans.toString());
        out.close();
    }
    
    private static void mano() {
        int n = sc.nextInt();
        
        long cnt = n;
        for(int i=1; i<=n; i++) {
            long k = (n / i);
            if(i != 1) {
                cnt += k;
            }
            cnt += k * (k - 1);
        }


        ans.append(cnt);
        
        ans.append("\n");
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