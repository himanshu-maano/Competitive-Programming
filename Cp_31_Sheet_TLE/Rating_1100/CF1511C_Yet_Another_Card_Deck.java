// https://codeforces.com/problemset/problem/1511/C

import java.util.*;
import java.io.*;

public class CF1511C_Yet_Another_Card_Deck {

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
        int q = sc.nextInt();
        int[] a = new int[51];
        for(int i=1; i<=n; i++) {
            int x = sc.nextInt();

            if(a[x] == 0) {
                a[x] = i;
            }
        }

        while(q-- > 0) {
            int p = sc.nextInt();


            int top = a[p];

            for(int i=1; i<51; i++) {
                if(top > a[i]) {
                    a[i] += 1;
                }
            }

            a[p] = 1;

            out.print(top + " ");
        }
        out.println(); 
        
    
        
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