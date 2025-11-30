import java.util.*;

public class B_Deck_of_Cards {

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

        String s = sc.next();

        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                cnt0++;
            } else if (ch == '1') {
                cnt1++;
            } else if (ch == '2') {
                cnt2++;
            }
        }

        char[] ans = new char[n];
        if ((n - (cnt0 + cnt1) == cnt2)) {
            Arrays.fill(ans, '-');
            for (char ch : ans) {
                System.out.print(ch);
            }
            System.out.println();
            return;
        }
        Arrays.fill(ans, '+');

        int i = 0;
        while (cnt0-- > 0) {
            ans[i++] = '-';
        }

        int temp = cnt2;
        while (temp-- > 0) {
            ans[i++] = '?';
        }

        i = n - 1;
        while (cnt1-- > 0) {
            ans[i--] = '-';
        }
        while (cnt2-- > 0) {
            ans[i--] = '?';
        }

        for (char ch : ans) {
            System.out.print(ch);
        }
        System.out.println();
    }
}