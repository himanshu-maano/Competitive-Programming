import java.util.*;
import java.io.*;

public class D_Friends_and_the_Restaurant {

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
        int[][] a = new int[n][2];
        for(int i=0; i<n; i++) {
            a[i][0] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            a[i][1] = sc.nextInt();
        }

        Arrays.sort(a, (x, y) -> Integer.compare(y[1]-y[0], x[1]-x[0]));
        
        int day = 0;
        int i=0, j=n-1;
        while(i < j) {
            if(a[i][0] + a[j][0] <= a[i][1] + a[j][1]) {
                day++;
                i++;
                j--;
            } else {
                int diff1 = a[i][1] - a[i][0];
                int diff2 = a[j][1] - a[j][0];
                if(diff1 < diff2) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        
        out.println(day);    
        
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