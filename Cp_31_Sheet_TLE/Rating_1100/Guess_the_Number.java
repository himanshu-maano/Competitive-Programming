import java.util.*;
import java.io.*;

public class Guess_the_Number {

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
        int l=1, r=(int)1e6;

        while(l <= r) {
            int m = l + (r - l) / 2;

            if(query(m).equals(">=")) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        out.println("! " + r);
    }

    static String query(int x) {
        System.out.println(x);
        System.out.flush();

        String s = sc.next();

        return s;
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