import java.util.*;

public class D_1_Max_Sum_OR_Easy_Version {

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

    }

    public static long largestPowerOfTwo(long l, long r) {
        long left = 0, right = 62;
        long ans = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long val = 1L << mid;

            if (val <= r) {
                ans = val;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (ans >= l) {
            return ans;
        }
        return -1;
    }
}