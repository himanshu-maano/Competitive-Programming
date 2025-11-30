import java.util.*;
import java.io.*;

public class C_Range_Operation {

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
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
    
        long[] pre = new long[n+1];
        for(int i=1; i<=n; i++) {
            pre[i] = pre[i-1] + a[i-1];
        }

        
        long l = -(long)1e9;
        long c = 0;
        // (r - l + 1) * (r + l) - p[r] - p[l - 1]
        for(long i=1; i<=n; i++) {
            l = Math.max(l, pre[(int)(i-1)] - (i * i) + i);

            long r = (i * i) + i - pre[(int)i];

            c = Math.max(c, l + r);
        }

        System.out.println(pre[n] + c);
    
        
    
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