// https://codeforces.com/problemset/problem/1821/B

import java.util.*;
import java.io.*;

public class CF1821B_Sort_the_Subarray {

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

        int l=-1,r=-1;
        int max = 0, min = (int)1e9;
        for(int i=0; i<n; i++) {
            if(a[i] != b[i]) {
                if(l == -1) {
                    l = i;
                }
                r = i;
                max = Math.max(max, a[i]);
                min = Math.min(min, a[i]);
            }
        }
        

        for(int i=l-1; i>=0; i--) {
            if(a[i] <= min) {
                l = i;
                min = a[i];
            } else {
                break;
            }
        }

        for(int i=r+1; i<n; i++) {
            if(a[i] >= max) {
                r = i;
                max = a[i];
            } else {
                break;
            }
        }
        
        System.out.println((l + 1) + " " + (r + 1));    
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