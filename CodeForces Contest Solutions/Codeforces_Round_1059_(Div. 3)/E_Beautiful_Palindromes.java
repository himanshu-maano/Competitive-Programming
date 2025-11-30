import java.util.*;
import java.io.*;

public class E_Beautiful_Palindromes {

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
        long[] a = new long[n];

        int cnt = 0;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (freq[(int) a[i]] == 0)
                cnt++;
            freq[(int) a[i]]++;
        }

        if (cnt == n) {
            for (int i = 0; i < k; i++) {
                System.out.print(a[i] + " ");
            }
        } else if (cnt == n - 1) {
            int x = -1, y = -1;
            for (int i = 1; i <= n; i++) {
                if (freq[i] == 0) {
                    x = i;
                    break;
                }
            }

            for (int i = 1; i <= n; i++) {
                if (i != x && a[n - 1] != i) {
                    y = i;
                    break;
                }
            }

            for (int i = 0; i < k; i++) {
                if (i % 3 == 0) {
                    System.out.print(x + " ");
                } else if (i % 3 == 1) {
                    System.out.print(y + " ");
                } else {
                    System.out.print(a[n - 1] + " ");
                }
            }

        } else if (cnt == n - 2) {
            int x = -1, y = -1;
            for (int i = 1; i <= n; i++) {
                if (freq[i] == 0 && x == -1) {
                    x = i;
                } else if (freq[i] == 0 && y == -1 && x != i) {
                    y = i;
                }
            }

            for (int i = 0; i < k; i++) {
                if (i % 3 == 0) {
                    System.out.print(x + " ");
                } else if (i % 3 == 1) {
                    System.out.print(y + " ");
                } else {
                    System.out.print(a[n - 1] + " ");
                }
            }

        } else {
            int x = -1, y = -1, z = -1;
            for (int i = 1; i <= n; i++) {
                if (freq[i] == 0 && x == -1) {
                    x = i;
                } else if (freq[i] == 0 && y == -1 && x != i) {
                    y = i;
                } else if (freq[i] == 0 && z == -1 && x != i && y != i) {
                    z = i;
                }
            }

            for (int i = 0; i < k; i++) {
                if (i % 3 == 0) {
                    System.out.print(x + " ");
                } else if (i % 3 == 1) {
                    System.out.print(y + " ");
                } else {
                    System.out.print(z + " ");
                }
            }
        }

        System.out.println();

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