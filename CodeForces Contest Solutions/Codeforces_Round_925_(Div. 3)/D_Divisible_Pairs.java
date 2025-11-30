import java.util.*;

public class D_Divisible_Pairs {

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
        long x = sc.nextLong();
        long y = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Map<Long, Map<Long, Long>> map = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long mod_X = (x - a[i] % x) % x;
            long mod_Y = a[i] % y;

            if (map.containsKey(mod_X) && map.get(mod_X).containsKey(mod_Y)) {
                ans += map.get(mod_X).get(mod_Y);
            }

            map.putIfAbsent(a[i] % x, new HashMap<>());
            map.get(a[i] % x).put(a[i] % y, map.get(a[i] % x).getOrDefault(a[i] % y, 0L) + 1);
        }

        System.out.println(ans);

    }
}