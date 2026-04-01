import java.util.*;
import java.io.*;

public class C_Secret_message {

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
        int k = sc.nextInt();

        boolean[][] str = new boolean[n][26];

        while (k-- > 0) {
            String s = sc.next();

            for (int i = 0; i < s.length(); i++) {
                str[i][s.charAt(i) - 'a'] = true;
            }
        }

        List<Integer> divN = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divN.add(i);
                if (i * i != n) {
                    divN.add(n / i);
                }
            }
        }

        Collections.sort(divN);

        for (int d : divN) {
            String st = "";
            boolean valid = true;

            for (int i = 0; i < d; i++) {

                boolean[] ok = new boolean[26];
                Arrays.fill(ok, true);

                for (int j = i; j < n; j += d) {
                    for (int f = 0; f < 26; f++) {
                        if (!str[j][f]) {
                            ok[f] = false;
                        }
                    }
                }

                char found = ' ';
                for (int j = 0; j < 26; j++) {
                    if (ok[j]) {
                        found = (char) ('a' + j);
                        break;
                    }
                }

                if (found != ' ') {
                    st += found;
                } else {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (int i = 0; i < n / d; i++) {
                    out.print(st);
                }
                out.println();
                return;
            }
        }

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