import java.util.*;
import java.io.*;

public class CStableGroups {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder ans = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        int test = 1;
        while (test-- > 0) {
            mano();
        }
        out.println(ans.toString());
        out.close();
    }
    
    private static void mano() {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        List<Long> list = new ArrayList<>();

        for(int i=1; i<n; i++) {
            long diff = a[i] - a[i-1];
            if(diff <= x) {
                continue;
            } else {
                list.add(diff - 1);
            }
        }

        Collections.sort(list);
        long cnt = list.size() + 1;

        for(int i=0; i<list.size(); i++) {
            if(list.get(i) / x <= k) {
                cnt--;
                k -= list.get(i) / x;
            }
        }
    
        ans.append(cnt);
    
        
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