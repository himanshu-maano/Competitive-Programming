import java.util.*;
import java.io.*;

public class B_Fence {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int test = 1;
        while (test-- > 0) {
            mano();
        }
        out.close();
    }
    
    private static void mano() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
    
        int[] pre = new int[n + 1];
        for(int i=1; i<=n; i++) {
            pre[i] = pre[i - 1] + a[i - 1];
        }

        int ans = (int)1e9 + 7, sum = (int)1e9 + 7;

        for(int i=0; i<=n-k; i++) {
            int currSum = pre[i + k] - pre[i];
            if(currSum < sum) {
                sum = currSum;
                ans = i + 1;
            }
        }

        out.println(ans);
    
        
        out.flush();
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