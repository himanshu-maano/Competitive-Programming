// https://codeforces.com/problemset/problem/1742/D

import java.util.*;
import java.io.*;

public class CF1742D_Coprime {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }
    
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static {
        for(int i=1; i<1001; i++) {
            map.putIfAbsent(i, new ArrayList<>());
            for(int j=1; j<1001; j++) {
                if(gcd(i, j) == 1) {
                    map.get(i).add(j);
                }
            }
        }
    }

    private static long gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static void mano() {
        int n = sc.nextInt();
        int[] idx = new int[1001];
        for(int i=1; i<=n; i++) {
            int x = sc.nextInt();
            idx[x] = i;
        }

        int max = -1;
    
        for(int i=1; i<1001; i++) {
            if(idx[i] > 0) {
                List<Integer> list = map.get(i);

                for(int j : list) {
                    if(idx[j] > 0) {
                        max = Math.max(max, idx[i] + idx[j]);
                    }
                }
            }
        }
        
        out.println(max);
        
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