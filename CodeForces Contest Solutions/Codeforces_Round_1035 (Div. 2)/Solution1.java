import java.util.*;

public class Solution1 {
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
        long px = sc.nextLong();
        long py = sc.nextLong();
        long qx = sc.nextLong();
        long qy = sc.nextLong();

        long[] a = new long[n];
        long maxDis = 0, max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            maxDis += a[i];
            max = Math.max(max, a[i]);
        }

        long minDis = (max - (maxDis - max)) <= 0 ? 0 : max - (maxDis - max);

        double euclDis = Math.sqrt((qx - px) * (qx - px) + (qy - py) * (qy - py));

        if((euclDis <= maxDis) && (euclDis >= minDis)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
