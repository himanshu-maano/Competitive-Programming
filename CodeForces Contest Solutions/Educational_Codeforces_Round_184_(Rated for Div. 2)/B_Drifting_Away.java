import java.util.*;
import java.io.*;

public class B_Drifting_Away {

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
        String s = sc.next();
        int n = s.length();

        String[] arr = {"*<", ">*", "**", "><"};

        for(String str : arr) {
            if(s.contains(str)) {
                System.out.println(-1);
                return;
            }
        }

        int i=0; 
        while (i < n && s.charAt(i) == '<') i++;
        if (i < n && s.charAt(i) == '*') i++;
        int j = n-1;
        while(j >=0 && s.charAt(j) == '>') j--;
        if(j >=0 && s.charAt(j) == '*') j--;

        System.out.println(Math.max(i, n - j - 1));


    
        
    
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