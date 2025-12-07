import java.util.*;
import java.io.*;

public class C_Needle_in_a_Haystack {

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
        String t = sc.next();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : s.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            freq2[ch - 'a']++;
        }

        boolean ok = true;

        for (char ch : s.toCharArray()) {
            if (freq2[ch - 'a'] < freq1[ch - 'a']) {
                ok = false;
                break;
            }
        }

        if (!ok) {
            System.out.println("Impossible");
        } else {
            StringBuilder ans = new StringBuilder();

            for (char ch : s.toCharArray()) {
                int val = ch - 'a';

                for (int i = 0; i < val; i++) {
                    while (freq2[i] > freq1[i]) {
                        ans.append((char)('a' + i));
                        freq2[i]--;
                    }
                }

                ans.append(ch);
                freq1[ch - 'a']--;
                freq2[ch - 'a']--;
            }

            for(int i=0; i<26; i++) {
                if(freq2[i] > 0) {
                    for(int j=0; j<freq2[i]; j++) {
                        ans.append((char)('a' + i));
                    }
                }
            }

            System.out.println(ans.toString());
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