import java.util.*;
import java.io.*;

public class A_Sakurako_s_Exam {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static final int size = 222;
    static int[] a = new int[size];
    
    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }
    
    private static void mano() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean ans = true;

        if((b & 1) == 1) {
            if(a < 2) {
                ans = false;
            } else if((a & 1) == 1) {
                ans = false;
            }
        } else {
            if((a & 1) == 1) {
                ans = false;
            }
        }

        System.out.println(ans ? "YES" : "NO");
        
    
        
    
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