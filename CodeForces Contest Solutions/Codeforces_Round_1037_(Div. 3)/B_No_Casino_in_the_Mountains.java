import java.util.*;

public class B_No_Casino_in_the_Mountains {

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
        int k = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int cnt = 0;
        int len = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                len++;
            } else {
                len = 0;
            }
            if (len == k) {
                cnt++;
                i++;
                len = 0;
            }
        }

        System.out.println(cnt);

    }
}