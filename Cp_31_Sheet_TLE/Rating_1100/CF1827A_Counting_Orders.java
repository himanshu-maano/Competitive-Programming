// https://codeforces.com/problemset/problem/1827/A

import java.util.*;
import java.io.*;

public class CF1827A_Counting_Orders {

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
    
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        long ans = 1;
        for(int i=n-1; i>=0; i--) {
            long valGreater = bs(a, b[i]);

            ans = (ans * Math.max(valGreater - (n - i - 1), 0)) % 1000000007;
        }

        out.println(ans);  
        
        out.flush();
    }
    
    private static long bs(int[] a, int x) {
        int n = a.length;
        int l=0, r=n-1;
        while(l <= r) {
            int m = l + (r - l) / 2;

            if(x < a[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return (n - l);
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