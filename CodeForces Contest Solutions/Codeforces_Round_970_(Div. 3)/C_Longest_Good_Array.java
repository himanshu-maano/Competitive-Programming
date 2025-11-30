import java.util.*;
import java.io.*;

public class C_Longest_Good_Array {

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static final int size = 2222;
    static int[] a = new int[size];

    public static void main(String[] args) throws IOException {
        int test = sc.nextInt();
        while (test-- > 0) {
            mano();
        }
        out.close();
    }

    private static void mano() {
        int l = sc.nextInt();
        int r = sc.nextInt();

        int diff = r - l;

        int s = 1, e = r;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            int sum = (mid * (mid + 1)) / 2;
            if (sum == diff) {
                ans = mid;
                break;
            } else if (sum < diff) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        System.out.println(ans + 1);

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