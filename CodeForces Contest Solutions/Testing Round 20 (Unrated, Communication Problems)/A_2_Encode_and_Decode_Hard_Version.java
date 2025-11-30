import java.util.*;
import java.io.*;

public class A_2_Encode_and_Decode_Hard_Version {

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
                sb.append(encode(x));
            }

            System.out.print(sb.toString());
        } else {
            String str = sc.next();

            int len = str.length() / 7;

            System.out.println(len);

            for(int i=0; i<len; i++) {
                int x = 0, pow = 1;
                for(int j=0; j<7; j++) {
                    x += (str.charAt(i*7 + j) - 'a') * pow;
                    pow *= 26;
                }
                System.out.print(x + " ");
            }

        }    
    }
    
    private static String encode(long x) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<7; i++) {
            sb.append((char)('a' + (x % 26L)));
            x /= 26;
        }

        return sb.toString();
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