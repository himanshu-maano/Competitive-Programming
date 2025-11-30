import java.util.*;

public class A_Candies_for_Nephews {
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

        int ans = n % 3;

        System.out.println((3 - ans) % 3);
    }
}
