import java.util.*;

public class B_Make_it_Divisible_by_25 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int test = sc.nextInt();
        while (test-- > 0) {
            solve();
        }
        sc.close();
    }

    private static void solve() {
        String s = sc.next();

        if (Long.parseLong(s) % 25 == 0) {
            System.out.println(0);
            return;
        }

        int n = s.length();

        int s0 = -1, s2 = -1, s5 = -1, s7 = -1, e0 = -1, e5 = -1;
        int min = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '5') {
                e5 = Math.max(i, e5);
            } else if (ch == '7' && e5 != -1) {
                s7 = Math.max(s7, i);
            } else if (ch == '2' && e5 != -1) {
                s2 = Math.max(s2, i);
            }
            if (ch == '5' && e0 != -1) {
                s5 = Math.max(s5, i);
            } else if (ch == '0' && e0 != -1) {
                s0 = Math.max(s0, i);
            } else if (ch == '0') {
                e0 = Math.max(e0, i);
            }
        }

        if (e0 > 0) {
            if (s0 > -1) {
                min = Math.min(min, n - s0 - 2);
            }
            if (s5 > -1) {
                min = Math.min(min, n - s5 - 2);
            }
        }
        if (e5 > 0) {
            if (s2 > -1) {
                min = Math.min(min, n - s2 - 2);
            }
            if (s7 > -1) {
                min = Math.min(min, n - s7 - 2);
            }
        }

        System.out.println(min);
    }
}