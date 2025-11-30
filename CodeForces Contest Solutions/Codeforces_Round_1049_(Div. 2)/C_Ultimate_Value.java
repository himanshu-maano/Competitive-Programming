import java.util.*;

public class C_Ultimate_Value {
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
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        if(n == 1) {
            System.out.println(a[0]);
            return;
        }

        long maxO = 0;
        long minE = Long.MAX_VALUE;
        long sumO = 0;
        long sumE = 0;
        int minIdx = -1;
        int maxIdx = -1;

        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                if (a[i] < minE) {
                    minE = a[i];
                    minIdx = i;
                }
                sumE += a[i];
            } else {
                if (a[i] >= maxO) {
                    maxO = a[i];
                    maxIdx = i;
                }
                sumO += a[i];
            }
        }

        if (maxO > minE) {
            sumE += (maxO - minE);
            sumO += (minE - maxO);
            System.out.println(Math.abs(maxIdx - minIdx) + sumE - sumO);
            return;
        }
        if (sumE > sumO) {
            long x = (n & 1) == 0 ? (n - 2) : (n - 1);
            long ans = x + sumE - sumO;
            System.out.println(ans);
            return;
        }
        long ans1 = Math.abs(maxIdx - minIdx) + sumE - sumO;

        System.out.println(ans1);
    }
}