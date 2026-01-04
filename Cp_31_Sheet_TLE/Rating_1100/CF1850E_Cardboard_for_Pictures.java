// https://codeforces.com/problemset/problem/1850/E

import java.util.*;
import java.io.*;

public class CF1850E_Cardboard_for_Pictures {

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
        long n = sc.nextLong();
        long c = sc.nextLong();
        long[] a = new long[(int)n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }

        long s = 1, e = 1000000000;

        while(s <= e) {
            long m = s + (e - s) / 2;

            if(w(a, m, c) <= c) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        
        out.println(e);   
        
        out.flush();
    }

    static long w(long[] a, long m, long c) {
        long total = 0;
        for(long x : a) {
            total += ((x + 2*m) * (x + 2*m));
            if(total > c) {
                return c+1;
            }
        }
        return total;
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