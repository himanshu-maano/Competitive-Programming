import java.util.*;

public class B_Shoe_Shuffling {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int len = 1;
        boolean possible = (n == 1) ? false : true;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                len++;
            } else {
                if (len == 1) {
                    possible = false;
                    break;
                }
                int j = i - len;
                a[j++] = i;
                while (j < i) {
                    a[j] = j;
                    j++;
                }
                len = 1;
            }
        }

        if (len > 1) {
            int j = n - len;
            a[j++] = n;
            while (j < n) {
                a[j] = j;
                j++;
            }
        } else {
            possible = false;
        }

        if (!possible) {
            System.out.println(-1);
        } else {
            for (long x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}