import java.util.*;
import java.io.*;

public class A_1_Encode_and_Decode_Easy_Version {

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
        String s = sc.next();

        if(s.equals("first")) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++) {
                long x = sc.nextLong();
                sb.append((char)('a' + x - 1));
            }

            System.out.print(sb.toString());
        } else {
            String str = sc.next();

            System.out.println(str.length());
            for(char c : str.toCharArray()) {
                System.out.print((c - 'a' + 1) + " ");
            }

        }
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