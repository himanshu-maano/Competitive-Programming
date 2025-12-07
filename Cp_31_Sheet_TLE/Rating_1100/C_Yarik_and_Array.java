import java.util.*;
import java.io.*;

public class C_Yarik_and_Array {

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
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
    
        int ans = a[0], sum = a[0], parity = (a[0] & 1);
        
        for(int i=1; i<n; i++) {
            if((a[i] & 1) != parity) {
                sum = Math.max(a[i], sum + a[i]);
            } else {
                sum = a[i];
            }
            parity = (a[i] & 1);            
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
        
    
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