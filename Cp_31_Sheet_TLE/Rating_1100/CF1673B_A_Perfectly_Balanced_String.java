// https://codeforces.com/problemset/problem/1673/B

import java.util.*;
import java.io.*;

public class CF1673B_A_Perfectly_Balanced_String {

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

        int[] freq = new int[26];
        int limit = 0;
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
            if(freq[ch - 'a'] == 1) limit++;
        }

        Map<Character, Integer> map = new HashMap<>();

        int n = s.length();

        boolean ok = true;

        for(int i=0; i<n; i++) {
            if(map.containsKey(s.charAt(i))) {
                if(i - map.get(s.charAt(i)) - 1 < limit - 1) {
                    ok = false;
                }
            }
            map.put(s.charAt(i), i);
        }

        System.out.println(ok ? "YES" : "NO");
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