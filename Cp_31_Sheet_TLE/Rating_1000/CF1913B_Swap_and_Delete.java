// https://codeforces.com/problemset/problem/1913/B

import java.util.*;

public class CF1913B_Swap_and_Delete {
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

        int cnt1 = 0;
        int cnt0 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                cnt0++;
            } else {
                cnt1++;
            }
        }

        int len = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                if (cnt1 == 0)
                    break;
                cnt1--;
            } else {
                if (cnt0 == 0)
                    break;
                cnt0--;
            }
            len++;
        }

        System.out.println(s.length() - len);

    }
}