import java.util.*;

public class A_Only_One_Digit {

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

        int ans = 9;

        while (n > 0) {
            int ld = n % 10;
            ans = Math.min(ld, ans);
            n /= 10;
        }

        System.out.println(ans);

    }
}