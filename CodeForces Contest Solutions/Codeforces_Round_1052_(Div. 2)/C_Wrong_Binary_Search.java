import java.util.*;

public class C_Wrong_Binary_Search {

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
        String s = sc.next();

        int[] ans = new int[n];
        boolean ok = true;
        int prev = -1, curr = -1000;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                prev = curr;
                curr = i;
                ans[i] = i + 1;
            }
            if (curr - prev - 1 == 1) {
                ok = false;
                break;
            }
        }

        if (curr == n - 2 || (n > 1 && s.charAt(0) == '0' && s.charAt(1) == '1')) {
            ok = false;
        }

        if (!ok) {
            System.out.println("NO");
            return;
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (ans[i] > 0) {
                int x = i;
                while (j < i) {
                    if (ans[j] > 0) {
                        j++;
                        continue;
                    }
                    ans[j++] = x;
                    x--;
                }
            }
        }

        j = 0;
        while (j < n && ans[j] != 0) {
            j++;
        }

        for (int i = 0; j < n; j++) {
            ans[j] = n - i;
            i++;
        }

        System.out.println("YES");
        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();

    }
}