import java.util.*;
import java.io.*;

public class C_Annoying_Game {

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
        long k = sc.nextLong();
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
    
        long[] b = new long[n];
        for(int i=0; i<n; i++) {
            b[i] = sc.nextLong();
        }
        
        if((k & 1) == 0) {
            System.out.println(maxSum(a));
        } else {
            long[] prefix = new long[n+1];
            long[] suffix = new long[n+2];

            for(int i=0; i<n; i++) {
                prefix[i+1] = Math.max(prefix[i] + a[i], a[i]);
            }

            for(int i=n-1; i>=0; i--) {
                suffix[i+1] = Math.max(suffix[i+2] + a[i], a[i]);
            }

            long ans = Long.MIN_VALUE;
            for(int i=1; i<=n; i++) {
                ans = Math.max(ans, prefix[i] + suffix[i] - a[i-1] + b[i-1]);
            }
            
            System.out.println(ans);
        }
    }

    public static long maxSum(long[] a) {
        long maxSum = a[0], sum = a[0];
        for(int i=1; i<a.length; i++) {
            sum = Math.max(a[i], sum + a[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
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