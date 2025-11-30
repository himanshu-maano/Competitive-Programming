import java.util.*;
import java.io.*;

public class B_Yuu_Koito_and_Minimum_Absolute_Sum {

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
        Integer[] a = new Integer[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        if(a[0] == -1) {
            a[0] = a[n-1];
        } else if(a[n-1] == -1) {
            a[n-1] = a[0];
        }

        long sum = 0;
        for(int i=1; i<n; i++) {
            int diff = a[i] - a[i-1];
            sum += diff;
        }
        System.out.println(Math.abs(sum));
        for(int i=0; i<n; i++) {
            System.out.print((a[i] == -1 ? 0 : a[i]) + " ");
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