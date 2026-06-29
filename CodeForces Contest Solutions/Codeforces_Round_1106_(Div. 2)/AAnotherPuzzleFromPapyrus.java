import java.util.*;
import java.io.*;

public class AAnotherPuzzleFromPapyrus {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder ans = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.println(ans.toString());
        out.close();
    }
    
    private static void mano() {
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }
        
        int op = 0;
        for(int i=0; i<n; i++) {
            if(a[i] >= b[i]) {
                op+= (a[i] - b[i]);
            } else {
                op = Integer.MAX_VALUE;
                break;
            }
        } 

        Arrays.sort(a);
        Arrays.sort(b);

        boolean ok = true;
        int op2 = 0;

        for(int i=0; i<n; i++) {
            if(a[i] >= b[i]) {
                op2 += (a[i] - b[i]);
            } else {
                ok = false;
                break;
            }
        }
         
        
    
        ans.append(ok ? Math.min(op, op2+c) : -1);
        ans.append("\n");
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