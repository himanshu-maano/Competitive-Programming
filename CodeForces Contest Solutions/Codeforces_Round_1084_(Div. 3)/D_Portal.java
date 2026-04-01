import java.util.*;
import java.io.*;

public class D_Portal {

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
        int x = sc.nextInt(), y = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] a = new int[y - x];
        for (int i = x, k = 0; i < y; i++) {
            a[k++] = arr[i];
        }

        int minIdx = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIdx]) {
                minIdx = i;
            }
        }

        int[] b = new int[n - y + x];
        int j = 0;
        for (int i = 0; i < x; i++) {
            b[j++] = arr[i];
        }
        for (int i = y; i < n; i++) {
            b[j++] = arr[i];
        }

        reverse(a, 0, minIdx - 1);
        reverse(a, minIdx, a.length - 1);
        reverse(a, 0, a.length - 1);

        int e = b.length;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > a[0]) {
                e = i;
                break;
            }
        }

        for (int i = 0; i < e; i++) {
            out.print(b[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            out.print(a[i] + " ");
        }
        for (int i = e; i < b.length; i++) {
            out.print(b[i] + " ");
        }

        out.println();
        // out.println(minIdx);

        // out.println(Arrays.toString(a));
        // out.println(Arrays.toString(b));

        out.flush();
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
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