import java.util.*;

public class D_A_and_B {

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

        if (n == 1 || n == 2) {
            System.out.println(0);
            return;
        }

        boolean ok = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(0)) {
                ok = false;
                break;
            }
        }

        if (!ok) {
            System.out.println(0);
            return;
        }

        int way1 = min(s, 'a');
        int way2 = min(s, 'b');

        System.out.println(Math.min(way1, way2));

    }

    private static int min(String s, char c) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == c) {
                list.add(i);
            }
        }

        int min = 0;
        for (int i = 0; i < list.size(); i++) {
            min += (list.get(i) - i);
        }

        int l = 1, r = list.size();

        while (r < s.length()) {
            int cnt = 0;
            for (int i = l, j = 0; i < r; i++, j++) {
                cnt += (list.get(j) - i);
            }
            min = Math.min(cnt, min);
            l++;
            r++;
        }

        return min;
    }
}