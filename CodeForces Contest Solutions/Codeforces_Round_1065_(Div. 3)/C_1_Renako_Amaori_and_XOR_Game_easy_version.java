import java.util.*;
import java.io.*;

public class C_1_Renako_Amaori_and_XOR_Game_easy_version {

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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // if(n == 1) {
        //     if(a[0] == b[0]) {
        //         System.out.println("Tie");
        //     } else {
        //         System.out.println("Ajisai");
        //     }
        //     return;
        // }

        int cnta = 0, cntb = 0;
        for (int i = 0; i < n; i++) {
            cnta += a[i];
            cntb += b[i];
        }


        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                if (a[i] != b[i]) {
                    if ((cnta & 1) == 0) {
                        cnta++;
                        cntb++;
                    }
                }
            } else {
                if (a[i] != b[i]) {
                    if ((cntb & 1) == 0) {
                        cntb++;
                        cnta++;
                    }
                }
            }
        }

        if ((cnta & 1) == (cntb & 1)) {
            System.out.println("Tie");
        } else if ((cnta & 1) == 1) {
            System.out.println("Ajisai");
        } else {
            System.out.println("Mai");
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