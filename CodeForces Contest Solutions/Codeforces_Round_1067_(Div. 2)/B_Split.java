import java.util.*;
import java.io.*;

public class B_Split {

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
        int[] a = new int[2*n];

        int[] freq = new int[2*n+1];
        for(int i=0; i<2*n; i++) {
            a[i] = sc.nextInt();
            freq[a[i]]++;
        }      

        int ans = 0, even = 0;
        for(int x : freq) {
            if (x == 0) continue;
            if((x & 1) == 1) {
                ans++;
            } else {
                even++;
            } 
        }

        if(ans == 0 && (even & 1) != (n & 1)) {
            even--;
        }
        ans += (2 * even);
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